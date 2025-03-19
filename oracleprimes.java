import java.io.*;
import java.util.*;

public class oracleprimes {
    public static void main(String[] args) throws Exception {
        final int MAXN = 120000;
        boolean[] isPrime = new boolean[MAXN + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= MAXN; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAXN; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int[] nextPrime = new int[MAXN + 2];
        for (int i = MAXN; i >= 0; i--) {
            if (isPrime[i])
                nextPrime[i] = i;
            else
                nextPrime[i] = nextPrime[i + 1];
        }
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            pw.println(nextPrime[n]);
        }
        pw.flush();
    }
}
