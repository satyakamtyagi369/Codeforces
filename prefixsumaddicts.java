import java.util.Scanner;
public class prefixsumaddicts{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n=hariom.nextInt();
        for(int j=0;j<n;j++){
            int a = hariom.nextInt();
            int k = hariom.nextInt();
            int arr[] = new int[k];
            for(int i=0;i<k;i++){
                arr[i]= hariom.nextInt();
            }
            int newarr[]=new int[k-1];
            for(int i=0;i<k-1;i++){
                int diff=arr[i+1]-arr[i];
                newarr[i]=diff;
            }
            
            boolean samediff=true;
            if(newarr.length==1){
                samediff=false;
                
            }
            for(int i=0;i<newarr.length-1;i++){
                if(newarr[i+1]<newarr[i]){
                    samediff=false;
                    break;
                }
            }
            if(samediff){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}