import java.util.Scanner;

public class manylcs {
    static final int mod = 998244353;

    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int m = hariom.nextInt();
        String s = hariom.next();
        int[][] dp = new int[m + 1][n + 1];

        dp[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= n; j++) {
                if (dp[i][j] == 0) continue;
                
                // Case 1: Pick any character not matching S[j] (25 choices)
                dp[i + 1][j] = (int) ((dp[i + 1][j] + 1L * dp[i][j] * 25) % mod);

                // Case 2: Pick a character that matches S[j], extending LCS
                if (j < n) {
                    dp[i + 1][j + 1] = (int) ((dp[i + 1][j + 1] + 1L * dp[i][j]) % mod);
                }
            }
        }

        // Ensure the last value is correctly printed
        for (int k = 0; k <= n; k++) {
            if (k == n) {
                System.out.print(dp[m][k]); // No trailing space
            } else {
                System.out.print(dp[m][k] + " ");
            }
        }
    }
}
