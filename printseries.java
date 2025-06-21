import java.util.*;
public class printseries{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=hariom.nextInt();
        }
        for(int i=0;i<n-1;i=i+2){
            if(i%2==0){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}