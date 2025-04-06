import java.util.*;
public class goalsofvictory {
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t-->0){
            int n= hariom.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n-1;i++){
                arr[i]= hariom.nextInt();
            }
            int sum =0;
            for(int i=0;i<n-1;i++){
                sum = sum + arr[i];
            }
            System.out.println(-sum);;
        }
    }
}
