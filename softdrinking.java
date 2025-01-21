
import java.util.Scanner;

public class softdrinking {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n=hariom.nextInt();
        int k=hariom.nextInt();
        int l=hariom.nextInt();
        int c=hariom.nextInt();
        int d=hariom.nextInt();
        int p=hariom.nextInt();
        int nl=hariom.nextInt();
        int np=hariom.nextInt();
        int drink= k*l;
        int toast1 = drink/nl;
        int toast2 = c*d;
        int toast3 = p/np;
        int friends=Math.min(toast1,Math.min(toast2,toast3))/n;
        System.out.println(friends);
    }
}
