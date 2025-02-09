import java.util.Scanner;

public class fanumtax {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while (t-- > 0) {
            solve(hariom);
        }
    }
    public static void solve(Scanner hariom) {
        int n = hariom.nextInt();
        int m = hariom.nextInt(); 
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = hariom.nextInt();
        }
        int b1 = hariom.nextInt(); 
        boolean possible = true;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) { 
                a[i] = b1 - a[i];  
                if (i > 0 && a[i] < a[i - 1]) { 
                    possible = false; 
                    break;
                }
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
