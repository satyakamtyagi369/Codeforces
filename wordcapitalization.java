
import java.util.Scanner;

public class wordcapitalization {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String s= hariom.next();
        char firstChar = Character.toUpperCase(s.charAt(0));
        String result = firstChar + s.substring(1);
        System.out.println(result);
    }
}
