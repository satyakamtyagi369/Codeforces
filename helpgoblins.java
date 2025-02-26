import java.util.*;

public class helpgoblins {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while(t-- > 0) {
            int n = hariom.nextInt();
            String s = hariom.next();
            int m = 0, u = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '-') m++;
                else u++;
            }
            if(m < 2 || u == 0) {
                System.out.println(0);
                continue;
            }
            int x = m / 2;
            int z = m - x;
            long ans = (long)x * u * z;
            System.out.println(ans);
        }
    }
}
