import java.util.*;
public class mex {
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t-->0){
            int n = hariom.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= hariom.nextInt();
            }
            int count0=0;
            int count1=0;
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    count0++;
                }else if(arr[i]==1){
                    count1++;
                }
            }
            int mex = Math.min(1, count0)+Math.min(1, count1);
            System.out.println(mex);
        }
    }
}
