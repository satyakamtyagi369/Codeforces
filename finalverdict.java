import java.util.*;
public class finalverdict{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while(t-->0){
            int n= hariom.nextInt();
            int s= hariom.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=hariom.nextInt();
            }
            int sum=0;
            for(int i=0;i<n;i++){
                sum = sum + arr[i];
            }
            if(sum==n*s){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}