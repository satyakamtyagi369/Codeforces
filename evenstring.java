import java.util.*;
public class evenstring {
    static final long MOD = 998244353;
    static final int MAX = 500000;
    static long[] fact = new long[MAX + 1];
    static long[] invfact = new long[MAX + 1];
    static long modexp(long a, long b, long mod) {
        long res = 1;
        a %= mod;
        while (b > 0) {
            if ((b & 1) == 1) res = (res * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
    static long modinv(long a, long mod) {
        return modexp(a, mod - 2, mod);
    }
    static void precomputeFactorials() {
        fact[0] = 1;
        for (int i = 1; i <= MAX; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        invfact[MAX] = modinv(fact[MAX], MOD);
        for (int i = MAX; i >= 1; i--) {
            invfact[i - 1] = (invfact[i] * i) % MOD;
        }
    }
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        precomputeFactorials();
        while (t-- > 0) {
            int[] c = new int[26];
            long L = 0;
            for (int i = 0; i < 26; i++) {
                c[i] = hariom.nextInt();
                L += c[i];
            }
            long odd = (L + 1) / 2;
            long even = L - odd;

            long[] dp = new long[(int) odd + 1];
            dp[0] = 1;
            for (int i = 0; i < 26; i++) {
                if (c[i] == 0) continue;
                for (int j = (int) odd; j >= c[i]; j--) {
                    dp[j] = (dp[j] + dp[j - c[i]]) % MOD;
                }
            }
            long F = dp[(int) odd];

            long ways = (fact[(int) odd] * fact[(int) even]) % MOD;
            long denom = 1;
            for (int i = 0; i < 26; i++) {
                denom = (denom * fact[c[i]]) % MOD;
            }
            ways = (ways * modinv(denom, MOD)) % MOD;
            long ans = (F * ways) % MOD;
            System.out.println(ans);
        }
    }
}
