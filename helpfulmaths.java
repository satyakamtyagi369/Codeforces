import java.util.Arrays;
import java.util.Scanner;
public class helpfulmaths {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String s= hariom.next();
        String[] numbers=s.split("\\+");
        Arrays.sort(numbers);
        String result = String.join("+",numbers);
        System.out.println(result); 
    }
}
