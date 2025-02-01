import java.util.Scanner;

public class seekgrid {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int m = hariom.nextInt();
        String[] s = new String[n];
        String[] t = new String[m];
        for (int i = 0; i < n; i++) {
            s[i] = hariom.next();
        }
        for (int i = 0; i < m; i++) {
            t[i] = hariom.next();
        }
        for (int a = 0; a <= n - m; a++) {
            for (int b = 0; b <= n - m; b++) {
                boolean result = true;
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < m; j++) {
                        if (s[a + i].charAt(b + j) != t[i].charAt(j)) {
                            result = false;
                            break;
                        }
                    }
                    if (!result) break;
                }
                if (result) { 
                    System.out.println((a + 1) + " " + (b + 1));
                    return;
                }
            }
        }
    }
}
