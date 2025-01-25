
import java.util.Scanner;

public class systemofequations {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int m= hariom.nextInt();
        int count=0;
        for(int a=0;a*a<=n;a++){
            int b=n-a*a;
            if(b>=0&&a+b*b==m){
                count++;
            }
        }
        System.out.println(count);
    }
}
