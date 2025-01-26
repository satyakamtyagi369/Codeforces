
import java.util.Arrays;
import java.util.Scanner;

public class sale {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int index=hariom.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=hariom.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        int count=0;
        for(int i=0;i<n&&count<index;i++){
            if(arr[i]<0){
            sum = sum + Math.abs(arr[i]);
            count++;
            }
        }
        System.out.println(sum);
    }
}
