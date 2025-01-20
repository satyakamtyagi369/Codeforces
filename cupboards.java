
import java.util.Scanner;

public class cupboards {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int a[]= new int[n];
        int b[]= new int[n];
        for(int j=0;j<n;j++){
            a[j]= hariom.nextInt();
            b[j]= hariom.nextInt();
        }
        int counta1=0;
        int counta0=0;
        int countb1=0;
        int countb0=0;
        for(int j=0;j<n;j++){
            if(a[j]==0){
                counta0++;
            }
            if(a[j]==1){
                counta1++;
            }
            if(b[j]==0){
                countb0++;
            }
            if(b[j]==1){
                countb1++;
            }
            
        }
        int mina=Math.min(counta0,counta1);
        int minb=Math.min(countb0,countb1);
        int sum= mina + minb;
        System.out.println(sum);
    }
}
