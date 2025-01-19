
import java.util.Scanner;

public class panoramixsprediction {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int prime= hariom.nextInt();
        int nextprime = hariom.nextInt();
        int validnextprime = findvalidnextprime(prime);
        if(validnextprime==nextprime){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static int findvalidnextprime(int n){
        int next=n+1;
        while(!isprime(next)){
            next++;
        }
        return next;
    }
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
