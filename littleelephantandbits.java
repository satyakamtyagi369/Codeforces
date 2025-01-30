import java.util.Scanner;

public class littleelephantandbits {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String s = hariom.next();
        boolean zeroRemoved = false;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!zeroRemoved && ch == '0') {
                zeroRemoved = true; 
            } else {
                result.append(ch);
            }
        }
        if (!zeroRemoved) {
            result = new StringBuilder(s.substring(0, s.length() - 1));
        }
        System.out.println(result);
        hariom.close();
    }
}
