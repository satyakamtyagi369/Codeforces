import java.util.*;

public class gridwalking {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long n = hariom.nextLong();
            long k = hariom.nextLong();
            long diagnals = 1;
            while (diagnals * diagnals < k) {
                diagnals++;
            }
            long start = (diagnals - 1) * (diagnals - 1) + 1;
            long offset = k - start;
            long r = Math.min(diagnals, n) - offset;
            long c = Math.min(diagnals, n);
            if (r < 1) {
                c += r - 1;
                r = 1;
            }
            sb.append(r).append(" ").append(c).append("\n");
        }
        System.out.print(sb);
    }
}
