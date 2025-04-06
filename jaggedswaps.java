
import java.util.Scanner;

public class jaggedswaps {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t=hariom.nextInt();
        while(t-->0){
            int n=hariom.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=hariom.nextInt();
            }
            int maxele=arr[0];
            int minele=arr[0];
            for(int i=0;i<n;i++){
                maxele=Math.max(maxele,arr[i]);
                minele=Math.min(minele,arr[i]);
            }
            for(int i=1;i<n-1;i++){
                if((arr[i]>arr[i-1])&&(arr[i]>arr[i+1])){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
                if((arr[0]==minele)&&(arr[n-1]==maxele)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
        }
    }
}
