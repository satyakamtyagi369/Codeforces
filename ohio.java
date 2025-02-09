import java.util.Scanner;

public class ohio {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        hariom.nextLine();
        while (t-- > 0) {
            String s = hariom.nextLine();
            System.out.println(minLength(s));
        }
    }

    public static int minLength(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return 1;
            }
        }
        return s.length();
    }
}
