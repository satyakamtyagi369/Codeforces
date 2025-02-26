import java.util.*;

public class newworldnewme {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        
        while (t-- > 0) {
            int n = hariom.nextInt();
            int k = hariom.nextInt();
            int p = hariom.nextInt();
            
            int minSum = n * (-p);
            int maxSum = n * p;
            
            if (k < minSum || k > maxSum) {
                System.out.println(-1);
                continue;
            }
            
            if (k == 0) {
                System.out.println(0);
                continue;
            }
            
            int absK = Math.abs(k);
            int minOps = absK / p;
            if (absK % p != 0) minOps++;
            
            if (minOps > n) {
                System.out.println(-1);
            } else {
                System.out.println(minOps);
            }
        }
        hariom.close();
    }
}
