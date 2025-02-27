import java.util.*;

public class binarygame {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        String s = hariom.next();
        hariom.close();
        
        System.out.println(countWinningSubstrings(s, n));
    }

    public static int countWinningSubstrings(String s, int n) {
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int zeros = 0, ones = 0;
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '0') {
                    zeros++;
                } else {
                    ones++;
                }

                if (zeros > 0 && (zeros % 2 == 0 || ones > 0)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
