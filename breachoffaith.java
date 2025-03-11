import java.util.*;
public class breachoffaith {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while (t-- > 0) {
            int n = hariom.nextInt();
            int sizeb = 2 * n;
            long[] b = new long[sizeb];
            for (int i = 0; i < sizeb; i++) {
                b[i] = hariom.nextLong();
            }
            long maxVal = Arrays.stream(b).max().getAsLong();
            List<Long> bprime = new ArrayList<>();
            boolean removed = false;
            for (long val : b) {
                if (!removed && val == maxVal) {
                    removed = true;
                    continue;
                }
                bprime.add(val);
            }
            Collections.sort(bprime);
            List<Long> Q = new ArrayList<>();
            List<Long> P = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                Q.add(bprime.get(i));
            }
            for (int i = n - 1; i < bprime.size(); i++) {
                P.add(bprime.get(i));
            }
            long sump = P.stream().mapToLong(Long::longValue).sum();
            long sumq = Q.stream().mapToLong(Long::longValue).sum();
            long extra = maxVal + sump - sumq;
            List<Long> a = new ArrayList<>();
            a.add(maxVal);
            a.add(extra);
            for (int i = 0; i < n; i++) {
                a.add(P.get(i));
                if (i < n - 1) {
                    a.add(Q.get(i));
                }
            }
            for (long num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}