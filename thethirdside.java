import java.util.*;

public class thethirdside {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while (t-- > 0) {
            int n = hariom.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = hariom.nextInt();
            System.out.println(solve(n, a));
        }
        hariom.close();
    }

    static int solve(int n, int[] a) {
        if (n == 1) return a[0];
        Arrays.sort(a);
        while (n > 1) {
            a[n - 2] = a[n - 2] + a[n - 1] - 1;
            n--;
        }
        return a[0];
    }
}
