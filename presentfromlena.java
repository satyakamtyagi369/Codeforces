
import java.util.*;

public class presentfromlena {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
       for(int i=0;i<=n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print("  ");
        }
        for(int j=0;j<=i;j++){
            System.out.print(j);
            if(j!=i){
                System.out.print(" ");
            }
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(" "+j);
        }
        System.out.println();
       }
       for(int i=n-1;i>=0;i--){
        for(int j=0;j<n-i;j++){
            System.out.print("  ");
        }
        for(int j=0;j<=i;j++){
            System.out.print(j);
            if(j!=i){
                System.out.print(" ");
            }
            
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(" "+j);
        }
        System.out.println();
       }
    }
}
