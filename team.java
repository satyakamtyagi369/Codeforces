
import java.util.Scanner;

public class team {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t=hariom.nextInt();
        int count=0;
        while(t-->0){
            int petya=hariom.nextInt();
            int vasya=hariom.nextInt();
            int tonya=hariom.nextInt();
            int sum=petya+vasya + tonya;
            if(sum>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
