import java.util.Scanner;
public class minimalcoprime {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t-->0){
            int a= hariom.nextInt();
            int b= hariom.nextInt();
            if(a==1&&b==1){
                System.out.println("1");
            }
            else {
                System.out.println(Math.abs(a-b));
            }
        }
    }
}
