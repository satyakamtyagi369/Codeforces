import java.io.*;
public class diversesubarray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter hariom = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] num = br.readLine().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(num[i]);
            }
            long ans = 0;
            for (int i = 0; i < n; i++) {
                int[] freq = new int[501];
                int distinct = 0;
                int maxfreq = 0;
                int limit = Math.min(n, i + 1000);
                for (int j = i; j < limit; j++) {
                    int x = a[j];
                    freq[x]++;
                    if (freq[x] == 1) {
                        distinct++;
                    }
                    maxfreq = Math.max(maxfreq, freq[x]);
                    if (maxfreq <= distinct) {
                        ans++;
                    }
                }
            }
            hariom.println(ans);
        }
        hariom.close();
    }
}
