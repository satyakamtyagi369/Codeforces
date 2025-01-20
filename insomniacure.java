import java.util.Scanner;

public class insomniacure {
    public static void main(String [] args){
        Scanner hariom  = new Scanner(System.in);
        int k= hariom.nextInt();
        int l= hariom.nextInt();
        int m= hariom.nextInt();
        int n= hariom.nextInt();
        int d= hariom.nextInt();
        int count=0;
        for(int i=1;i<=d;i++){
            if(i%k==0||i%l==0||i%m==0||i%n==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
