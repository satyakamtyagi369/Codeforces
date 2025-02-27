import java.util.Scanner;

public class robotreset {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while(t-- > 0) {
            long n = hariom.nextLong();
            long x = hariom.nextLong();
            long k = hariom.nextLong();
            String s = hariom.next();
            long[] d = new long[(int)n + 1];
            for (int i = 1; i <= n; i++) {
                if(s.charAt(i - 1) == 'L')
                    d[i] = d[i - 1] - 1;
                else
                    d[i] = d[i - 1] + 1;
            }
            long firstResetTime = -1;
            for (int i = 1; i <= n; i++) {
                if(x + d[i] == 0) {
                    firstResetTime = i;
                    break;
                }
            }
            if(firstResetTime == -1 || firstResetTime > k) {
                System.out.println(0);
                continue;
            }
            long resets = 1;
            long cycleResetTime = -1;
            for (int i = 1; i <= n; i++) {
                if(d[i] == 0) {
                    cycleResetTime = i;
                    break;
                }
            }
            if(cycleResetTime == -1) {
                System.out.println(resets);
                continue;
            }
            long rem = k - firstResetTime;
            resets += rem / cycleResetTime;
            System.out.println(resets);
        }
    }
}
