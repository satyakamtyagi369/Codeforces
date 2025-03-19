import java.util.*;
public class cciselection{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n=hariom.nextInt();
        int arr[]=new int[n];
        int alice=0;
        int bob=0;
        for(int i=0;i<n;i++){
            arr[i]=hariom.nextInt();
            if(arr[i]==0){
                alice++;
            }
            else{
                bob++;
            }
        }
        if(alice>bob){
            System.out.println("ALICE");
        }
        else if(alice<bob){
            System.out.println("BOB");
        }
        else{
            System.out.println("TIE");
        }
    }
}