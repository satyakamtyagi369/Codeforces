import java.util.*;

public class shashliks {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while (t-- > 0) {
            long k = hariom.nextLong();
            long a = hariom.nextLong();
            long b = hariom.nextLong();
            long x = hariom.nextLong();
            long y = hariom.nextLong();
            long result = getportion(k, a, b, x, y);
            System.out.println(result);
        }
    }
    public static long getportion(long k, long a, long b, long x, long y) {
        long tp, dp, tq, dq;
        if (x <= y) {
            tp = a;  
            dp = x;
            tq = b;
            dq = y;
        } else {
            tp = b;  
            dp = y;
            tq = a;  
            dq = x;
        }
        long m = Math.max(a, b);
        long total = 0;
        if (k >= m) {
            long times = (k - m)/dp + 1;
            total += times;
            k -= times * dp;
        }
        if (k >= tp) {
            long times = (k - tp)/ dp + 1;
            total += times;
        } else if (k >= tq) {
            long times = (k - tq) /dq + 1;
            total += times;
        }
        return total;
    }
}
