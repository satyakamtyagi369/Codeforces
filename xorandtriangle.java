import java.util.*;

public class xorandtriangle {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while (t-- > 0) {
            int x = hariom.nextInt();
            int ans = -1;
            
            for (int y = 1; y < x; y++) {
                int xor = x ^ y;
                if (x + y > xor && x + xor > y && y + xor > x) {
                    ans = y;
                    break;
                }
            }
            
            System.out.println(ans);
        }
        hariom.close();
    }
}
