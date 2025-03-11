import java.io.*;
public class scammy {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            int n = Integer.parseInt(br.readLine().trim());
            long[] K = new long[n];
            long[] A = new long[n];
            long[] B = new long[n];
            for (int i = 0; i < n; i++) {
                String line = br.readLine();
                String[] parts = line.split(" ");
                char opLeft = parts[0].charAt(0);
                int aLeft = Integer.parseInt(parts[1]);
                char opRight = parts[2].charAt(0);
                int aRight = Integer.parseInt(parts[3]);
                long K_left = 0, A_left = 0;
                if (opLeft == '+') {
                    K_left = aLeft;
                    A_left = 0;
                } else {
                    K_left = 0;
                    A_left = aLeft - 1;
                }
                long K_right = 0, B_right = 0;
                if (opRight == '+') {
                    K_right = aRight;
                    B_right = 0;
                } else {
                    K_right = 0;
                    B_right = aRight - 1;
                }
                K[i] = K_left + K_right;
                A[i] = A_left;
                B[i] = B_right;
            }
            long p = 1, q = 1, r_val = 0;
            for (int i = n - 1; i >= 0; i--) {
                long Ki = K[i];
                long Ai = A[i];
                long Bi = B[i];
                long new_p, new_q, new_r;
                if (p > q) {
                    new_p = p * (1 + Ai);
                    new_q = q + p * Bi;
                    new_r = p * Ki + r_val;
                } else if (p < q) {
                    new_p = p + q * Ai;
                    new_q = q * (1 + Bi);
                    new_r = q * Ki + r_val;
                } else {
                    new_p = p * (1 + Ai);
                    new_q = p * (1 + Bi);
                    new_r = p * Ki + r_val;
                }
                p = new_p;
                q = new_q;
                r_val = new_r;
            }
            long ans = p + q + r_val;
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
