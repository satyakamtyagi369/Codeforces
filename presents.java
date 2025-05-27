import java.util.*;
public class presents{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=hariom.nextInt();
        }
        int ans[]= new int[n];
        for(int i=0;i<n;i++){
            ans[arr[i]-1]=i+1;
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}