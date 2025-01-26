
import java.util.Scanner;

public class footballb {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int counta = 0, countb = 0;
        String a = "", b = "";
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = hariom.next();
            if (i == 0) {
                a = s[0];
                counta++;
            } else {
                if (s[i].equals(a)) {
                    counta++;
                } else {
                    if (b.isEmpty()) {
                        b = s[i];
                    }
                    countb++;
                }
            }
        }
        if (counta > countb) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
