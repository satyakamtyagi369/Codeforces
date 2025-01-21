
import java.util.Scanner;

public class tram {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int enter[]= new int[n];
        int out[]= new int[n];
        for(int i=0;i<n;i++){
            out[i]= hariom.nextInt();
            enter[i]= hariom.nextInt();
        }
        int maxenter=0;
        int entere=0;
        int oute=0;
        for(int i=0;i<n;i++){
            oute=entere-out[i];
            entere=0;
            entere=entere + enter[i]+ oute;
            maxenter=Math.max(entere,maxenter);
        }
        System.out.println(maxenter);
    }
}
