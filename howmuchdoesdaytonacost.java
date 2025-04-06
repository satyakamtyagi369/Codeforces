
import java.util.Scanner;

public class howmuchdoesdaytonacost {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while(t-->0){
            int n= hariom.nextInt();
            int k= hariom.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= hariom.nextInt();
            }
            boolean found=false;
            for(int i=0;i<n;i++){
                if(arr[i]==k){
                    found=true;
                    break;
                }
            }
            if(found){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
