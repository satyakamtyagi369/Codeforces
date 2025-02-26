import java.io.*;
import java.util.*;

public class graphinclusion {
    static class DSU_ARollback {
        int rv, ru;
        int sizeRuBefore;
        int numMerged;
        int dsuBUpdatesBefore;
        
        DSU_ARollback(int rv, int ru, int sizeRuBefore, int numMerged, int dsuBUpdatesBefore) {
            this.rv = rv;
            this.ru = ru;
            this.sizeRuBefore = sizeRuBefore;
            this.numMerged = numMerged;
            this.dsuBUpdatesBefore = dsuBUpdatesBefore;
        }
    }
    
    static class DSU_A {
        int n;
        int[] parent, sz;
        List<List<Integer>> comp;
        List<DSU_ARollback> st;
        
        DSU_A(int n) {
            this.n = n;
            parent = new int[n+1];
            sz = new int[n+1];
            comp = new ArrayList<>(n+1);
            st = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                comp.add(new ArrayList<>());
            }
            for (int i = 1; i <= n; i++){
                parent[i] = i;
                sz[i] = 1;
                comp.get(i).add(i);
            }
        }
        
        int find(int a) {
            while(a != parent[a]) {
                a = parent[a];
            }
            return a;
        }
    }
    
    static class DSUB_Update {
        int broot;
        int key;
        int oldVal;
        boolean keyExisted;
        
        DSUB_Update(int broot, int key, int oldVal, boolean keyExisted) {
            this.broot = broot;
            this.key = key;
            this.oldVal = oldVal;
            this.keyExisted = keyExisted;
        }
    }
    
    static class DSUB_Rollback {
        int rv, ru;
        List<DSUB_Update> updates;
        HashMap<Integer, Integer> savedMap;
        
        DSUB_Rollback(int rv, int ru, List<DSUB_Update> updates, HashMap<Integer, Integer> savedMap) {
            this.rv = rv;
            this.ru = ru;
            this.updates = updates;
            this.savedMap = savedMap;
        }
    }
    
    static class DSU_B {
        int n;
        int[] parent, sz;
        List<HashMap<Integer, Integer>> mp;
        List<DSUB_Rollback> st;
        int globalAns;
        
        DSU_B(int n) {
            this.n = n;
            parent = new int[n+1];
            sz = new int[n+1];
            mp = new ArrayList<>(n+1);
            st = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                mp.add(new HashMap<>());
            }
            for (int i = 1; i <= n; i++){
                parent[i] = i;
                mp.get(i).put(i, 1);
            }
            globalAns = 0;
        }
        
        int find(int a) {
            while(a != parent[a]) {
                a = parent[a];
            }
            return a;
        }
    }
    
    static DSU_B globalDSUB = null;
    static List<DSUB_Update> dsuB_updates = new ArrayList<>();
    
    static void dsuA_union(DSU_A dA, int a, int b) {
        a = dA.find(a);
        b = dA.find(b);
        if(a == b) return;
        if(dA.sz[a] < dA.sz[b]) {
            int tmp = a; a = b; b = tmp;
        }
        DSU_ARollback rec = new DSU_ARollback(b, a, dA.sz[a], dA.comp.get(b).size(), dsuB_updates.size());
        
        dA.parent[b] = a;
        dA.sz[a] += dA.sz[b];
        for (int x : dA.comp.get(b)) {
            int broot = globalDSUB.find(x);
            HashMap<Integer, Integer> map = globalDSUB.mp.get(broot);
            {
                int oldVal = map.get(b);
                int newVal = oldVal - 1;
                dsuB_updates.add(new DSUB_Update(broot, b, oldVal, true));
                if(newVal == 0){
                    map.remove(b);
                    globalDSUB.globalAns -= 1;
                } else {
                    map.put(b, newVal);
                }
            }
            {
                if(!map.containsKey(a)){
                    dsuB_updates.add(new DSUB_Update(broot, a, 0, false));
                    map.put(a, 1);
                    globalDSUB.globalAns += 1;
                } else {
                    int oldVal = map.get(a);
                    dsuB_updates.add(new DSUB_Update(broot, a, oldVal, true));
                    map.put(a, oldVal + 1);
                }
            }
            dA.comp.get(a).add(x);
        }
        dA.comp.get(b).clear();
        dA.st.add(rec);
    }
    
    static void dsuA_rollback(DSU_A dA) {
        if(dA.st.isEmpty()) return;
        DSU_ARollback rec = dA.st.remove(dA.st.size()-1);
        while(dsuB_updates.size() > rec.dsuBUpdatesBefore) {
            DSUB_Update upd = dsuB_updates.remove(dsuB_updates.size()-1);
            HashMap<Integer, Integer> map = globalDSUB.mp.get(upd.broot);
            if(upd.oldVal == 0){
                if(map.containsKey(upd.key)){
                    map.remove(upd.key);
                    globalDSUB.globalAns -= 1;
                }
            } else {
                boolean existed = map.containsKey(upd.key);
                map.put(upd.key, upd.oldVal);
                if(!existed)
                    globalDSUB.globalAns += 1;
            }
        }
        int ru = rec.ru, rv = rec.rv;
        dA.parent[rv] = rv;
        dA.sz[ru] = rec.sizeRuBefore;
        for (int i = 0; i < rec.numMerged; i++){
            int lastIndex = dA.comp.get(ru).size() - 1;
            int x = dA.comp.get(ru).remove(lastIndex);
            dA.comp.get(rv).add(x);
        }
    }
    
    static void dsuB_union(DSU_B dB, int a, int b) {
        a = dB.find(a);
        b = dB.find(b);
        if(a == b) return;
        if(dB.mp.get(a).size() < dB.mp.get(b).size()) {
            int tmp = a; a = b; b = tmp;
        }
        List<DSUB_Update> updates = new ArrayList<>();
        DSUB_Rollback rec;
        for (Map.Entry<Integer, Integer> p : dB.mp.get(b).entrySet()) {
            int key = p.getKey(), cnt = p.getValue();
            if(!dB.mp.get(a).containsKey(key)){
                updates.add(new DSUB_Update(a, key, 0, false));
                dB.mp.get(a).put(key, cnt);
                dB.globalAns += 1;
            } else {
                int oldVal = dB.mp.get(a).get(key);
                updates.add(new DSUB_Update(a, key, oldVal, true));
                dB.mp.get(a).put(key, oldVal + cnt);
            }
        }
        dB.globalAns -= (dB.mp.get(b).size() - 1);
        HashMap<Integer, Integer> savedMap = new HashMap<>(dB.mp.get(b));
        dB.mp.get(b).clear();
        dB.parent[b] = a;
        dB.sz[a] += dB.sz[b];
        rec = new DSUB_Rollback(a, b, updates, savedMap);
        dB.st.add(rec);
    }
    
    static void dsuB_rollback(DSU_B dB) {
        if(dB.st.isEmpty()) return;
        DSUB_Rollback rec = dB.st.remove(dB.st.size()-1);
        int ru = rec.ru, rv = rec.rv;
        for (int i = rec.updates.size()-1; i >= 0; i--) {
            DSUB_Update upd = rec.updates.get(i);
            HashMap<Integer, Integer> map = dB.mp.get(upd.broot);
            if(upd.oldVal == 0){
                if(map.containsKey(upd.key)){
                    map.remove(upd.key);
                    dB.globalAns -= 1;
                }
            } else {
                boolean existed = map.containsKey(upd.key);
                map.put(upd.key, upd.oldVal);
                if(!existed)
                    dB.globalAns += 1;
            }
        }
        dB.globalAns += (rec.savedMap.size() - 1);
        dB.parent[rv] = rv;
        dB.sz[ru] -= dB.sz[rv];
        dB.mp.set(rv, rec.savedMap);
    }
    
    static class Edge {
        int u, v;
        Edge(int u, int v) { this.u = u; this.v = v; }
    }
    
    static class Query {
        char type;
        int u, v;
        Query(char type, int u, int v) {
            this.type = type;
            this.u = u;
            this.v = v;
        }
    }
    
    static int n, q;
    static List<List<Edge>> segA, segB;
    static int[] ans;
    
    static void segtree_update(List<List<Edge>> seg, int idx, int tl, int tr, int l, int r, Edge e) {
        if(l > tr || r < tl) return;
        if(l <= tl && tr <= r) {
            seg.get(idx).add(e);
            return;
        }
        int mid = (tl + tr) / 2;
        segtree_update(seg, idx*2, tl, mid, l, r, e);
        segtree_update(seg, idx*2+1, mid+1, tr, l, r, e);
    }
    
    static DSU_A dsuA;
    static DSU_B dsuB;
    
    static void segtree_dfs(int idx, int tl, int tr) {
        int stateA = dsuA.st.size();
        int stateB = dsuB.st.size();
        int dsuB_updateState = dsuB_updates.size();
        
        for (Edge e : segA.get(idx)) {
            dsuA_union(dsuA, e.u, e.v);
        }
        for (Edge e : segB.get(idx)) {
            dsuB_union(dsuB, e.u, e.v);
        }
        
        if(tl == tr) {
            ans[tl] = dsuB.globalAns;
        } else {
            int mid = (tl + tr) / 2;
            segtree_dfs(idx*2, tl, mid);
            segtree_dfs(idx*2+1, mid+1, tr);
        }
        while(dsuB.st.size() > stateB)
            dsuB_rollback(dsuB);
        while(dsuA.st.size() > stateA)
            dsuA_rollback(dsuA);
        while(dsuB_updates.size() > dsuB_updateState) {
            DSUB_Update upd = dsuB_updates.remove(dsuB_updates.size()-1);
            HashMap<Integer, Integer> map = dsuB.mp.get(upd.broot);
            if(upd.oldVal == 0){
                if(map.containsKey(upd.key)){
                    map.remove(upd.key);
                    dsuB.globalAns -= 1;
                }
            } else {
                boolean existed = map.containsKey(upd.key);
                map.put(upd.key, upd.oldVal);
                if(!existed)
                    dsuB.globalAns += 1;
            }
        }
    }
    
    static class Interval {
        int l, r, u, v;
        Interval(int l, int r, int u, int v) {
            this.l = l; this.r = r; this.u = u; this.v = v;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());
        Query[] queries = new Query[q+1];
        for (int i = 1; i <= q; i++){
            st = new StringTokenizer(br.readLine());
            char type = st.nextToken().charAt(0);
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            queries[i] = new Query(type, u, v);
        }
        
        Map<Long, Integer> lastA = new HashMap<>();
        Map<Long, Integer> lastB = new HashMap<>();
        List<Interval> intervalsA = new ArrayList<>();
        List<Interval> intervalsB = new ArrayList<>();
        
        for (int i = 1; i <= q; i++){
            char t = queries[i].type;
            int u = queries[i].u, v = queries[i].v;
            long key = encode(u, v);
            if(t=='A'){
                if(!lastA.containsKey(key)){
                    lastA.put(key, i);
                } else {
                    int stTime = lastA.get(key);
                    intervalsA.add(new Interval(stTime, i-1, u, v));
                    lastA.remove(key);
                }
            } else {
                if(!lastB.containsKey(key)){
                    lastB.put(key, i);
                } else {
                    int stTime = lastB.get(key);
                    intervalsB.add(new Interval(stTime, i-1, u, v));
                    lastB.remove(key);
                }
            }
        }
        for (Map.Entry<Long, Integer> entry : lastA.entrySet()){
            int stTime = entry.getValue();
            int u = (int)(entry.getKey() >> 32);
            int v = (int)(entry.getKey() & 0xffffffffL);
            intervalsA.add(new Interval(stTime, q, u, v));
        }
        for (Map.Entry<Long, Integer> entry : lastB.entrySet()){
            int stTime = entry.getValue();
            int u = (int)(entry.getKey() >> 32);
            int v = (int)(entry.getKey() & 0xffffffffL);
            intervalsB.add(new Interval(stTime, q, u, v));
        }
        
        int segSize = 4 * (q + 1);
        segA = new ArrayList<>(segSize+1);
        segB = new ArrayList<>(segSize+1);
        for (int i = 0; i <= segSize; i++){
            segA.add(new ArrayList<>());
            segB.add(new ArrayList<>());
        }
        
        for (Interval itv : intervalsA) {
            Edge e = new Edge(itv.u, itv.v);
            segtree_update(segA, 1, 1, q, itv.l, itv.r, e);
        }
        for (Interval itv : intervalsB) {
            Edge e = new Edge(itv.u, itv.v);
            segtree_update(segB, 1, 1, q, itv.l, itv.r, e);
        }
        
        ans = new int[q+1];
        dsuA = new DSU_A(n);
        dsuB = new DSU_B(n);
        globalDSUB = dsuB;
        
        segtree_dfs(1, 1, q);
        
        for (int i = 1; i <= q; i++){
            out.println(ans[i]);
        }
        out.flush();
        out.close();
    }
    
    static long encode(int a, int b) {
        if(a > b) {
            int tmp = a; a = b; b = tmp;
        }
        return (((long)a) << 32) | (b & 0xfffffL);
    }
}
