import java.util.*;
public class linetrip{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t-->0){
            int n=hariom.nextInt();
            int x=hariom.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=hariom.nextInt();
            }
            int required=0;
            required =Math.max(required,arr[0]);
            for(int i=0;i<n-1;i++){
                required=Math.max(required,arr[i+1]-arr[i]);
            }
            required=Math.max(required,2*(x-arr[n-1]));
            System.out.println(required);
        }
    }
}