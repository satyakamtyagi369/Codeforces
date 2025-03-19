import java.io.*;
import java.util.*;
  
public class presentbetter {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        int[] p = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
        int totalPositions = n + 2;
        int[] scoreA = new int[n + 1];
        int[] scoreB = new int[n + 1];
        scoreA[0] = 0;
        scoreB[0] = 0;
        for (int i = 1; i <= n; i++) {
            int val = p[i - 1];
            scoreA[i] = scoreA[i - 1] + (val < A ? 1 : (val > A ? -1 : 0));
            scoreB[i] = scoreB[i - 1] + (val < B ? 1 : (val > B ? -1 : 0));
        }
        int deltaM = (B < A ? 1 : (B > A ? -1 : 0));
        int deltaC = (A < B ? 1 : (A > B ? -1 : 0));
        long ans = 0;
        for (int posM = 1; posM <= totalPositions; posM++) {
            for (int posC = 1; posC <= totalPositions; posC++) {
                if (posM == posC) continue;
                int fixedM = (posM < posC ? posM - 1 : posM - 2);
                int fixedC = (posC < posM ? posC - 1 : posC - 2);
                int scoreM = scoreA[fixedM] + (posC < posM ? deltaM : 0);
                int scoreC = scoreB[fixedC] + (posM < posC ? deltaC : 0);
                if (scoreM > scoreC) ans++;
            }
        }
        out.println(ans);
        out.flush();
    }
}
