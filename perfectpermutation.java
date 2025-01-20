import java.util.Scanner;

public class perfectpermutation{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int arr[]=new int[n];
        if(n%2!=0){
            System.out.println("-1");
         }
        else{
            
            for(int i=1;i<=n;i++){
                arr[i-1]=i;
            }
            for(int i=0;i<n;i+=2){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}