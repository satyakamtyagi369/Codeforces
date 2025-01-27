import java.util.Scanner;
public class missingnumber{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int arr[]= new int[n];
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n-1;i++){
            arr[i]= hariom.nextInt();
            sum1=sum1+ arr[i];
        }
        //System.out.println(sum1);
        for(int i=1;i<=n;i++){
            sum2=sum2+i;
        }
       // System.out.println(sum2);
        System.out.println(sum2-sum1);

    }
}