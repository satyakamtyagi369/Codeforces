
import java.util.Scanner;

public class thenumberofposition {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int a= hariom.nextInt();
        int b= hariom.nextInt();
        if(a<0||b>n||n>100){
            System.out.println(0);
            return;
        }
    System.out.println(Math.min(n-a,b+1));    
    }
}
