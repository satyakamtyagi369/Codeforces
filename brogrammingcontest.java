import java.util.*;

public class brogrammingcontest {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while(t-- > 0) {
            int a = hariom.nextInt();
            String s = hariom.next();
            int count = 0;
            if(s.charAt(0) == '1') {
                count++;
            }
            for (int i = 1; i < a; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
