import java.util.*;

public class removetheends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            long candidate1 = -1, candidate2 = -1, candidate3 = -1;
            int r = n - 1;
            while(r >= 0 && a[r] < 0) {
                r--;
            }
            boolean ok = true;
            for(int i = 0; i <= r; i++){
                if(a[i] <= 0) { ok = false; break; }
            }
            if(ok && r < n - 1) {
                long sumPos = 0;
                for(int i = 0; i <= r; i++){
                    sumPos += a[i];
                }
                long sumNeg = 0;
                for(int i = r + 1; i < n; i++){
                    sumNeg += -a[i];
                }
                candidate1 = sumPos + sumNeg;
            }
            int l = 0;
            while(l < n && a[l] <= 0) {
                l++;
            }
            if(l < n) {
                boolean allPos = true;
                for(int i = l; i < n; i++){
                    if(a[i] <= 0){ allPos = false; break; }
                }
                if(allPos) {
                    long sum = 0;
                    for(int i = l; i < n; i++){
                        sum += a[i];
                    }
                    candidate2 = sum;
                }
            }
            int r2 = 0;
            while(r2 < n && a[r2] < 0) {
                r2++;
            }
            if(r2 > 0) {
                boolean allNeg = true;
                for(int i = 0; i < r2; i++){
                    if(a[i] >= 0){ allNeg = false; break; }
                }
                if(allNeg) {
                    long sum = 0;
                    for(int i = 0; i < r2; i++){
                        sum += -a[i];
                    }
                    candidate3 = sum;
                }
            }
            long ans = Math.max(candidate1, Math.max(candidate2, candidate3));
            System.out.println(ans);
        }
        sc.close();
    }
}
