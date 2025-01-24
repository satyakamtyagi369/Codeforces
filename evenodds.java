import java.util.Scanner;
public class evenodds {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        long n=hariom.nextLong();
        long k= hariom.nextLong();
        long half=(n+1)/2;
        if(k<=half){
            System.out.println(2*k-1);
        }
        else{
            System.out.println(2*(k-half));
        }
    }
}
