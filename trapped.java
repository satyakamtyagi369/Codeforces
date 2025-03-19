import java.io.*;
import java.util.*;
  
public class trapped {
    static int[] tin, tout, euler; 
    static int timer = 0;
    static ArrayList<Integer>[] adj; 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        adj = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }
        tin = new int[n+1];
        tout = new int[n+1];
        euler = new int[n+1];
        timer = 0;
        dfs(1, 0);
        SegmentTree segA = new SegmentTree(n);
        SegmentTree segB = new SegmentTree(n);
        for (int i = 1; i <= n; i++) {
            int u = euler[i];
            segA.pointInsert(1, 1, n, i, a[u]);
            segB.pointInsert(1, 1, n, i, b[u]);
        }
        int q = Integer.parseInt(br.readLine());
        for (int qi = 0; qi < q; qi++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            if (type == 1) { 
                int x = Integer.parseInt(st.nextToken());
                char c = st.nextToken().charAt(0);
                int d = Integer.parseInt(st.nextToken());
                int pos = tin[x]; 
                if (c == 'a') {
                    int oldVal = a[x];
                    int newVal = oldVal + d;
                    a[x] = newVal;
                    segA.pointUpdate(1, 1, n, pos, oldVal, newVal);
                } else { 
                    int oldVal = b[x];
                    int newVal = oldVal + d;
                    b[x] = newVal;
                    segB.pointUpdate(1, 1, n, pos, oldVal, newVal);
                }
            } else { 
                int x = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());
                int L = tin[x], R = tout[x];
                int countA = segA.query(1, 1, n, L, R, k);
                int countB = segB.query(1, 1, n, L, R, k - 1);
                int ans = countA - countB;
                out.println(ans);
            }
        }
  
        out.flush();
        out.close();
    }
    static void dfs(int u, int parent) {
        tin[u] = ++timer;
        euler[timer] = u;
        for (int v : adj[u]) {
            if (v == parent) continue;
            dfs(v, u);
        }
        tout[u] = timer;
    }
    static class SegmentTree {
        int n;
        TreapNode[] tree;
  
        SegmentTree(int n) {
            this.n = n;
            tree = new TreapNode[4 * n];
        }
        void pointInsert(int idx, int l, int r, int pos, int value) {
            if (pos < l || pos > r) return;
            tree[idx] = Treap.insert(tree[idx], new TreapNode(value, pos));
            if (l == r) return;
            int mid = (l + r) >> 1;
            if (pos <= mid) pointInsert(idx << 1, l, mid, pos, value);
            else pointInsert(idx << 1 | 1, mid + 1, r, pos, value);
        }
        void pointUpdate(int idx, int l, int r, int pos, int oldVal, int newVal) {
            if (pos < l || pos > r) return;
            tree[idx] = Treap.erase(tree[idx], oldVal, pos);
            tree[idx] = Treap.insert(tree[idx], new TreapNode(newVal, pos));
            if (l == r) return;
            int mid = (l + r) >> 1;
            if (pos <= mid) pointUpdate(idx << 1, l, mid, pos, oldVal, newVal);
            else pointUpdate(idx << 1 | 1, mid + 1, r, pos, oldVal, newVal);
        }
        int query(int idx, int l, int r, int ql, int qr, int X) {
            if (qr < l || ql > r) return 0;
            if (ql <= l && r <= qr) {
                return Treap.countLessEqual(tree[idx], X);
            }
            int mid = (l + r) >> 1;
            return query(idx << 1, l, mid, ql, qr, X) +
                   query(idx << 1 | 1, mid + 1, r, ql, qr, X);
        }
    }
    static class TreapNode {
        int val, pos;
        int priority, size;
        TreapNode left, right;
  
        TreapNode(int val, int pos) {
            this.val = val;
            this.pos = pos;
            this.priority = Treap.rand.nextInt();
            this.size = 1;
        }
    }
  
    static class Treap {
        static Random rand = new Random();
        static int size(TreapNode node) {
            return node == null ? 0 : node.size;
        }
        static void updateSize(TreapNode node) {
            if (node != null) {
                node.size = 1 + size(node.left) + size(node.right);
            }
        }
        static int compare(TreapNode a, TreapNode b) {
            if (a.val != b.val) return a.val - b.val;
            return a.pos - b.pos;
        }
        static TreapNode insert(TreapNode root, TreapNode it) {
            if (root == null) return it;
            if (compare(it, root) < 0) {
                root.left = insert(root.left, it);
                if (root.left.priority > root.priority) {
                    root = rotateRight(root);
                }
            } else {
                root.right = insert(root.right, it);
                if (root.right.priority > root.priority) {
                    root = rotateLeft(root);
                }
            }
            updateSize(root);
            return root;
        }
        static TreapNode erase(TreapNode root, int val, int pos) {
            if (root == null) return null;
            if (root.val == val && root.pos == pos) {
                return merge(root.left, root.right);
            }
            if (compareKey(val, pos, root) < 0) {
                root.left = erase(root.left, val, pos);
            } else {
                root.right = erase(root.right, val, pos);
            }
            updateSize(root);
            return root;
        }
        static int compareKey(int val, int pos, TreapNode node) {
            if (val != node.val) return val - node.val;
            return pos - node.pos;
        }
        static TreapNode merge(TreapNode a, TreapNode b) {
            if (a == null) return b;
            if (b == null) return a;
            if (a.priority > b.priority) {
                a.right = merge(a.right, b);
                updateSize(a);
                return a;
            } else {
                b.left = merge(a, b.left);
                updateSize(b);
                return b;
            }
        }
        static TreapNode rotateRight(TreapNode root) {
            TreapNode newRoot = root.left;
            root.left = newRoot.right;
            newRoot.right = root;
            updateSize(root);
            updateSize(newRoot);
            return newRoot;
        }
        static TreapNode rotateLeft(TreapNode root) {
            TreapNode newRoot = root.right;
            root.right = newRoot.left;
            newRoot.left = root;
            updateSize(root);
            updateSize(newRoot);
            return newRoot;
        }
        static int countLessEqual(TreapNode root, int X) {
            if (root == null) return 0;
            if (root.val <= X) {
                return size(root.left) + 1 + countLessEqual(root.right, X);
            } else {
                return countLessEqual(root.left, X);
            }
        }
    }
}