
import java.util.Scanner;

public class easyproblem {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t-->0){
            int n=hariom.nextInt();
            int a;
            int b=1;
            int count=0;
            while(b<=n-1){
                a=n-b;
                if(a>0 && a<n){
                    count++;
                }
                b++;
            }
            System.out.println(count);
        }
    }
}
