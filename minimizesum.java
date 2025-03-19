import java.io.*;
import java.util.*;

public class minimizesum {
    static class SegmentTree {
        int size;
        long[] tree;
        final long INF = Long.MAX_VALUE;
        
        public SegmentTree(int n) {
            size = 1;
            while(size < n) size *= 2;
            tree = new long[2 * size];
            Arrays.fill(tree, INF);
        }
        public void update(int pos, long val) {
            pos += size;
            tree[pos] = val;
            while(pos > 1) {
                pos /= 2;
                tree[pos] = Math.min(tree[2 * pos], tree[2 * pos + 1]);
            }
        }
        public long query(int l, int r) {
            long res = INF;
            l += size;
            r += size;
            while(l <= r) {
                if ((l & 1) == 1) {
                    res = Math.min(res, tree[l]);
                    l++;
                }
                if ((r & 1) == 0) {
                    res = Math.min(res, tree[r]);
                    r--;
                }
                l /= 2;
                r /= 2;
            }
            return res;
        }
    }
    
    public static void main(String[] args) throws IOException {
        // Fast input reading.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String s = br.readLine().trim();
        st = new StringTokenizer(br.readLine());
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        long[] dp0 = new long[n + 2]; 
        long[] dp1 = new long[n + 2];
        dp0[n+1] = 0;
        dp1[n+1] = 0;
        SegmentTree segTree = new SegmentTree(n + 1);
        segTree.update(n, dp0[n+1]);  
        for (int i = n; i >= 1; i--) {
            long option1 = a[i] + dp1[i + 1];
            int L = i + 1;
            int R = Math.min(n + 1, i + k);
            long option2 = segTree.query(L - 1, R - 1); 
            dp1[i] = Math.min(option1, option2);
            if (s.charAt(i - 1) == '1') {
                dp0[i] = dp1[i];
            } else {
                dp0[i] = a[i] + dp0[i + 1];
            }
            segTree.update(i - 1, dp0[i]);
        }
        System.out.println(dp0[1]);
    }
}
