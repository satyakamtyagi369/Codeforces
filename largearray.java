
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class largearray {
    public static void main(String[] args) throws java.io.IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String[] parts = br.readLine().split(" ");
            int n = Integer.parseInt(parts[0]);
            int k = Integer.parseInt(parts[1]);
            long x = Long.parseLong(parts[2]);
            String[] aParts = br.readLine().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(aParts[i]);
            }
            long total = 0;
            for (int num : a) {
                total += num;
            }
            long[] f = new long[n];
            for (int i = 1; i < n; i++) {
                f[i] = f[i-1] + a[i-1];
            }
            long answer = 0;
            for (int j = 0; j < k; j++) {
                long threshold = total * (long)(k - j) - x;
                if (threshold < 0) continue;
                int cnt = upperBound(f, threshold);
                answer += cnt;
            }
            out.println(answer);
        }
        out.flush();
        out.close();
    }
    private static int upperBound(long[] f, long target) {
        int low = 0, high = f.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (f[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
