import java.util.*;
public class seatinginabus{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t-->0){
            int n = hariom.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=hariom.nextInt();
            }
            boolean occupied[]= new boolean[n+2];
            boolean ok = true;
            for(int i=0;i<n;i++){
                int seat = arr[i];
                if(i==0){
                    occupied[seat]=true;
                }
                else{
                    if(!occupied[seat-1] && !occupied[seat+1]){
                        ok =false;
                        break;
                    }
                    occupied[seat]=true;
                }
            }
            System.out.println(ok?"YES":"NO");
        }
    }
}