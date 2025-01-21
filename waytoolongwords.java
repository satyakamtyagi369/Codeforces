
import java.util.Scanner;

public class waytoolongwords {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t--> 0){
            String a= hariom.next();
            if(a.length()<=10){
                System.out.print(a);
            }
            else{
                int midsize=a.length()-2;
                System.out.print(a.charAt(0) + "" + midsize + a.charAt(a.length()-1));
            }
            System.out.println();
        }
    }
}
