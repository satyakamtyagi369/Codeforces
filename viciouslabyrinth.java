import java.util.*;
public class viciouslabyrinth {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while (t-- > 0) {
            int n = hariom.nextInt();
            long k = hariom.nextLong();
            int[] a = new int[n + 1]; 
            if (k % 2 == 1) { 
                for (int i = 1; i < n; i++) {
                    a[i] = n;
                }
                a[n] = n - 1; 
            } else { 
                if (n == 2) {
                    a[1] = 2;
                    a[2] = 1;
                } else {
                    for (int i = 1; i <= n - 2; i++) {
                        a[i] = n - 1; 
                    }
                    a[n - 1] = n;
                    a[n] = n - 1;
                }
            }
            for (int i = 1; i <= n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
