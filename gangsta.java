
import java.util.Arrays;
import java.util.Scanner;
public class gangsta {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while (t-- > 0) {
            int n = hariom.nextInt();
            String s = hariom.next();
            long[] P = new long[n + 1];
            P[0] = 0;
            for (int i = 1; i <= n; i++) {
                P[i] = P[i - 1] + (s.charAt(i - 1) == '1' ? 1 : -1);
            }
            Arrays.sort(P);
            long prefixSum = 0;
            long sumDiff = 0;
            for (int i = 0; i <= n; i++) {
                sumDiff += P[i] * i - prefixSum;
                prefixSum += P[i];
            }
            long totalLenSum = (long) n * (n + 1) * (n + 2) / 6;
            long result = (totalLenSum + sumDiff) / 2;
            System.out.print(result);
            if (t > 0) System.out.println();
        }
    }
}
