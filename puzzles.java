
import java.util.*;

public class puzzles {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int m= hariom.nextInt();
        int arr[]= new int[m];
        for(int i=0;i<m;i++){
            arr[i]=hariom.nextInt();
        }
        int diff=Integer.MAX_VALUE;
        Arrays.sort(arr);
            
                for(int i=0;i<=m-n;i++){
                    int maxi=arr[i+n-1];
                    int mini=arr[i];
                    diff=Math.min(diff,maxi-mini);
                }
                
         
            System.out.println(diff);
        
    }
}
