import java.io.*;
import java.util.*;

public class treejumps {
    static final long MOD = 998244353;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] parent = new int[n+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 2; i <= n; i++) {
                parent[i] = Integer.parseInt(st.nextToken());
            }
            int[] depth = new int[n+1];
            depth[1] = 0;
            int maxDepth = 0;
            for (int i = 2; i <= n; i++) {
                depth[i] = depth[parent[i]] + 1;
                maxDepth = Math.max(maxDepth, depth[i]);
            }
            int[] freq = new int[maxDepth + 2];
            for (int i = 2; i <= n; i++) {
                freq[depth[i]]++;
            }
            long[] dp = new long[maxDepth + 3];
            dp[maxDepth + 1] = 0;
            for (int d = maxDepth; d >= 1; d--) {
                long ways = freq[d];
                ways = (ways + ((freq[d] - 1L) * dp[d+1]) % MOD) % MOD;
                dp[d] = ways;
            }
            long ans = (1 + dp[1]) % MOD;
            out.println(ans);
        }
        out.flush();
        out.close();
    }
}
