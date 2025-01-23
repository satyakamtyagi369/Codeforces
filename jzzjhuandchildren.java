
import java.util.Scanner;

public class jzzjhuandchildren {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int m= hariom.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=hariom.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<=m){
                arr[i]=0;
            }
        }
        double moxa=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(Math.ceil((double)arr[i]/m)>=moxa){
                moxa=Math.ceil((double)arr[i]/m);
                ans=i;
            }
        }
        System.out.println(ans+1);
    }
}
