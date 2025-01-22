
import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t=hariom.nextInt();
        int sum=0;
        while(t-- > 0){
            String s = hariom.next();
            if((s.equals("X++"))||(s.equals("++X"))){
                sum = sum + 1;
            }
            else if((s.equals("X--"))||(s.equals("--X"))){
                sum = sum - 1;
            }
        }
        System.out.println(sum);
    }
}
