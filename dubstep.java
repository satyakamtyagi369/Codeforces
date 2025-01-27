
import java.util.Scanner;

public class dubstep {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String s= hariom.next();
        String result = s.replaceAll("WUB"," ").trim();
        result=result.replaceAll("\\s+"," ");
        System.out.println(result);
    }
}
