
import java.util.Scanner;

public class requiredlength {
    public static void main(String[] args) {
        Scanner hariom =new Scanner(System.in);
        String s= hariom.next();
        int l = hariom.nextInt();
        if(s.length()>=l){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
