import java.io.*;
import java.util.*;

public class presenthardnew {
    
    static class Fenw {
        int n;
        long[] tree;
        public Fenw(int n) {
            this.n = n;
            tree = new long[n];
        }
        public void update(int idx, long delta) {
            for (; idx < n; idx = idx | (idx + 1))
                tree[idx] += delta;
        }
        public long query(int idx) {
            long sum = 0;
            for (; idx >= 0; idx = (idx & (idx + 1)) - 1)
                sum += tree[idx];
            return sum;
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        
        int[] p = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
        
        int L = n + 1;
        int[] prefixA = new int[L];
        int[] prefixB = new int[L];
        prefixA[0] = 0;
        prefixB[0] = 0;
        
        for (int i = 0; i < n; i++) {
            int addA = 0, addB = 0;
            if (p[i] < A)
                addA = 1;
            else if (p[i] > A)
                addA = -1;
            if (p[i] < B)
                addB = 1;
            else if (p[i] > B)
                addB = -1;
            prefixA[i + 1] = prefixA[i] + addA;
            prefixB[i + 1] = prefixB[i] + addB;
        }
        
        long delta, deltaPrime;
        if (A < B) {
            delta = 1;
            deltaPrime = -1;
        } else if (A > B) {
            delta = -1;
            deltaPrime = 1;
        } else {
            delta = 0;
            deltaPrime = 0;
        }
        
        long S1 = 0, S2 = 0, S3 = 0;
        int offset = n;
        int sizeFenw = 2 * n + 5;
        
        {
            Fenw fenw = new Fenw(sizeFenw);
            for (int i = L - 1; i >= 0; i--) {
                int threshold = prefixA[i] - (int)delta - 1;
                int idxThreshold = threshold + offset;
                if (idxThreshold < 0)
                    idxThreshold = -1;
                if (idxThreshold >= sizeFenw)
                    idxThreshold = sizeFenw - 1;
                long cnt = (idxThreshold >= 0 ? fenw.query(idxThreshold) : 0);
                S1 += cnt;
                int pos = prefixB[i] + offset;
                fenw.update(pos, 1);
            }
        }
        
        {
            Fenw fenw = new Fenw(sizeFenw);
            for (int i = 0; i < L; i++) {
                int threshold = prefixA[i] + (int)deltaPrime - 1;
                int idxThreshold = threshold + offset;
                if (idxThreshold < 0)
                    idxThreshold = -1;
                if (idxThreshold >= sizeFenw)
                    idxThreshold = sizeFenw - 1;
                long cnt = (idxThreshold >= 0 ? fenw.query(idxThreshold) : 0);
                S2 += cnt;
                int pos = prefixB[i] + offset;
                fenw.update(pos, 1);
            }
        }
        
        for (int g = 0; g < L; g++) {
            if (prefixA[g] > prefixB[g] + delta)
                S3++;
            if (prefixA[g] + deltaPrime > prefixB[g])
                S3++;
        }
        
        long ans = S1 + S2 + S3;
        System.out.println(ans);
    }
}
