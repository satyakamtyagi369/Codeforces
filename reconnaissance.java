import java.util.Scanner;
public class reconnaissance{
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=hariom.nextInt();
        }
        int actualdiff=Integer.MAX_VALUE;
        int index1=-1;
        int index2=-1;
        for(int i=0;i<n-1;i++){
            int diffnew=Math.abs(arr[i+1]-arr[i]);
            if(actualdiff>diffnew){
                actualdiff=diffnew;
                index1=i;
                index2=i+1;
            }
        }
        int circularDiff = Math.abs(arr[n - 1] - arr[0]);
        actualdiff = Math.min(circularDiff, actualdiff);
        if(circularDiff<=actualdiff){
            actualdiff=circularDiff;
            index1=n-1;
            index2=0;
        }
        System.out.println((index1+1)+" "+(index2+1));
    }
}
