import java.io.*;
import java.util.*;
 
public class friendsandpizza {
    public static void main(String[] args) throws Exception {
        new friendsandpizza().run();
    }
 
    void run() throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] friends = new String[m];
        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < m; i++) {
            friends[i] = st.nextToken();
        }
        int[] a = new int[n];
        st = new StringTokenizer(in.readLine());
        int total = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            total += a[i];
        }
        int oddMask = 0;
        int evenMask = 0;
        for (int j = 0; j < n; j++) {
            if (a[j] % 2 == 1)
                oddMask |= (1 << j);
            else
                evenMask |= (1 << j);
        }
 
        int fullSize = 1 << n;
        int[] maskValue = new int[fullSize];
        int[] evenValue = new int[fullSize];
        for (int mask = 0; mask < fullSize; mask++) {
            int sum = 0;
            int evenSum = 0;
            for (int j = 0; j < n; j++) {
                if ((mask & (1 << j)) != 0) {
                    sum += a[j];
                    if ((evenMask & (1 << j)) != 0)
                        evenSum += a[j];
                }
            }
            maskValue[mask] = sum;
            evenValue[mask] = evenSum;
        }
        int[] f = new int[fullSize];
        for (int i = 0; i < m; i++) {
            int mask = 0;
            for (int j = 0; j < friends[i].length(); j++) {
                mask |= 1 << (friends[i].charAt(j) - 'A');
            }
            f[mask]++;
        }
        ArrayList<Integer> keys = new ArrayList<>();
        for (int mask = 0; mask < fullSize; mask++) {
            if (f[mask] != 0) {
                keys.add(mask);
            }
        }
        long[] ans = new long[total + 1];
        for (int mask : keys) {
            int cnt = f[mask];
            if (cnt >= 2) {
                if ((mask & oddMask) == 0) {
                    long ways = ((long)cnt * (cnt - 1)) / 2;
                    int unionVal = maskValue[mask];
                    int monEat = total - unionVal;
                    ans[monEat] += ways;
                }
            }
        }
        int size = keys.size();
        for (int i = 0; i < size; i++) {
            int maskX = keys.get(i);
            int valX = maskValue[maskX];
            for (int j = i + 1; j < size; j++) {
                int maskY = keys.get(j);
                if ((maskX & maskY & oddMask) != 0) continue;
 
                long ways = (long) f[maskX] * f[maskY];
                int valY = maskValue[maskY];
                int unionVal = valX + valY - evenValue[maskX & maskY];
                int monEat = total - unionVal;
                ans[monEat] += ways;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k <= total; k++) {
            sb.append(ans[k]).append(" ");
        }
        System.out.println(sb);
    }
}
