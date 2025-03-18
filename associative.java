import java.io.*;
import java.util.*;

public class associative {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static long calc(long x, long y) throws IOException {
        out.println("? " + x + " " + y);
        out.flush();
        return Long.parseLong(br.readLine().trim());
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int t = nextInt();
        for (int tc = 0; tc < t; tc++) {
            int n = nextInt();
            int k = nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            int B = k + 1;
            int numBlocks = (n + B - 1) / B;
            long[][] blockL = new long[numBlocks][];
            long[][] blockR = new long[numBlocks][];
            int[] blockStart = new int[numBlocks];
            int[] blockEnd = new int[numBlocks];
            for (int b = 0; b < numBlocks; b++) {
                int start = b * B;
                int end = Math.min(n - 1, start + B - 1);
                blockStart[b] = start;
                blockEnd[b] = end;
                int len = end - start + 1;
                blockL[b] = new long[len];
                blockR[b] = new long[len];
                blockL[b][0] = a[start];
                for (int i = 1; i < len; i++) {
                    blockL[b][i] = calc(blockL[b][i - 1], a[start + i]);
                }
                blockR[b][len - 1] = a[end];
                for (int i = len - 2; i >= 0; i--) {
                    blockR[b][i] = calc(a[start + i], blockR[b][i + 1]);
                }
            }
            int m = n - B + 1;
            long[] bArr = new long[m];
            for (int i = 0; i < m; i++) {
                int j = i + B - 1;
                int b1 = i / B;
                int b2 = j / B;
                if (b1 == b2) {
                    if (i % B == 0) {
                        bArr[i] = blockL[b1][j - blockStart[b1]];
                    } else {
                        long res = a[i];
                        for (int x = i + 1; x <= j; x++) {
                            res = calc(res, a[x]);
                        }
                        bArr[i] = res;
                    }
                } else {
                    long leftPart = blockR[b1][i - blockStart[b1]];
                    long rightPart = blockL[b2][j - blockStart[b2]];
                    bArr[i] = calc(leftPart, rightPart);
                }
            }
            out.print("! ");
            for (int i = 0; i < m; i++) {
                out.print(bArr[i] + " ");
            }
            out.println();
            out.flush();
        }
        out.close();
        br.close();
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}
