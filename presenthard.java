import java.util.*;

class FenwickTree {
    private long[] tree;
    private int size;

    public FenwickTree(int n) {
        this.size = n;
        this.tree = new long[n + 1];
    }

    public void update(int index, long value) {
        while (index <= size) {
            tree[index] += value;
            index += index & -index;
        }
    }

    public long query(int index) {
        long sum = 0;
        while (index > 0) {
            sum += tree[index];
            index -= index & -index;
        }
        return sum;
    }
}

public class presenthard{
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        long A = hariom.nextLong(), B = hariom.nextLong();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = hariom.nextInt();
        }
        hariom.close();
        
        int L = n + 1;
        int[] prefixA = new int[L];
        int[] prefixB = new int[L];
        
        for (int i = 0; i < n; i++) {
            int addA = 0, addB = 0;
            if (p[i] < A) addA = 1;
            else if (p[i] > A) addA = -1;
            if (p[i] < B) addB = 1;
            else if (p[i] > B) addB = -1;
            prefixA[i + 1] = prefixA[i] + addA;
            prefixB[i + 1] = prefixB[i] + addB;
        }
        
        long delta, deltaPrime;
        if (A < B) { delta = 1; deltaPrime = -1; }
        else if (A > B) { delta = -1; deltaPrime = 1; }
        else { delta = 0; deltaPrime = 0; }
        
        long S1 = 0, S2 = 0, S3 = 0;
        int offset = n;
        int sizeFenw = 2 * n + 5;

        FenwickTree fenw1 = new FenwickTree(sizeFenw);
        for (int i = L - 1; i >= 0; i--) {
            int threshold = prefixA[i] - (int)delta - 1;
            int idxThreshold = threshold + offset;
            if (idxThreshold < 0) idxThreshold = -1;
            if (idxThreshold >= sizeFenw) idxThreshold = sizeFenw - 1;
            long cnt = (idxThreshold >= 0 ? fenw1.query(idxThreshold) : 0);
            S1 += cnt;
            int pos = prefixB[i] + offset;
            fenw1.update(pos + 1, 1); 
        }

        FenwickTree fenw2 = new FenwickTree(sizeFenw);
        for (int i = 0; i < L; i++) {
            int threshold = prefixA[i] + (int)deltaPrime - 1;
            int idxThreshold = threshold + offset;
            if (idxThreshold < 0) idxThreshold = -1;
            if (idxThreshold >= sizeFenw) idxThreshold = sizeFenw - 1;
            long cnt = (idxThreshold >= 0 ? fenw2.query(idxThreshold) : 0);
            S2 += cnt;
            int pos = prefixB[i] + offset;
            fenw2.update(pos + 1, 1);
        }

        for (int g = 0; g < L; g++) {
            if (prefixA[g] > prefixB[g] + delta) S3++;
            if (prefixA[g] + deltaPrime > prefixB[g]) S3++;
        }

        long ans = S1 + S2 + S3;
        System.out.println(ans);
    }
}
