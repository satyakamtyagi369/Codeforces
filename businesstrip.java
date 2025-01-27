import java.util.Arrays;
import java.util.Scanner;
public class businesstrip{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int k= hariom.nextInt();
        int arr[]= new int[12];
        for(int i=0;i<12;i++){
            arr[i]= hariom.nextInt();
        }
        if(k==0){
            System.out.println(0);
            return;
        }
        int total =0;
        int month=0;
        Arrays.sort(arr);
        for(int i=11;i>=0;i--){
            total= total+arr[i];
            month++;
            if(total>=k){
                System.out.println(month);
                return;
            }
        }
        System.out.println(-1);


    }
}