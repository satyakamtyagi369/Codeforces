import java.util.*;

public class varietyisdiscouraged {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        
        while (t-- > 0) {
            int n = hariom.nextInt();
            String s = hariom.next();
            int segments = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    segments++;
                }
            }
            int ans = (s.charAt(0) == '0') ? segments - 1 : segments;
            System.out.println(ans);
        }
        hariom.close();
    }
}
