import java.util.Scanner;
public class subsequenceupdate {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while(t--> 0){
            int s= hariom.nextInt();
            int sega=hariom.nextInt()-1;
            int segb=hariom.nextInt()-1;
            int arr[]=new int[s];
            for(int i=0;i<s;i++){
                arr[i]=hariom.nextInt();
            }
            

            int revarr[]=new int[s];
            for(int i=s-1;i>=0;i--){
                revarr[s-1-i]=arr[i];
            }
            int sum=0;
            for(int i=sega;i<=segb;i++){
                sum +=revarr[i];
            }
            if(revarr.length%2==0&&revarr.length>2){
                
                System.out.println(sum-1);
            }
            else{
                System.out.println(sum);
            }
        }
    }
}
