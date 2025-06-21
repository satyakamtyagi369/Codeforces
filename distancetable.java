import java.util.*;
public class distancetable {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int arr[]= new int[n-1];
        for(int i=0;i<arr.length;i++){
            arr[i]=hariom.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum = sum + arr[j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
