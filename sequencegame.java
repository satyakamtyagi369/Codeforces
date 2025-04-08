import java.util.*;

public class sequencegame {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = hariom.nextInt();
            long[] b = new long[n];
            for (int i = 0; i < n; i++) {
                b[i] = hariom.nextLong();
            }
            List<Long> a = new ArrayList<>();
            a.add(b[0]);
            for (int i = 1; i < n; i++) {
                if (b[i] >= b[i - 1]) {
                    a.add(b[i]);
                } else {
                    a.add(b[i]);
                    a.add(b[i]);
                }
            }
            out.append(a.size()).append('\n');
            for (int i = 0; i < a.size(); i++) {
                out.append(a.get(i)).append(' ');
            }
            out.append('\n');
        }
        System.out.print(out);
    }
}
