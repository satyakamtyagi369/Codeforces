
import java.util.Scanner;

public class iqtest {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = hariom.nextInt();
        }
        int evencount =0;
        int oddcount =0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        if(evencount>oddcount){
            for(int i=0;i<n;i++){
                if(arr[i]%2==1){
                    System.out.println(i+1);
                    break;
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(arr[i]%2==0){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
