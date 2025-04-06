import java.util.Scanner;
public class donttrytocode {
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t-->0){
            int n= hariom.nextInt();
            int m= hariom.nextInt();
            String x=hariom.next();
            String s=hariom.next();
            String curr=x;
            int ans=-1;
            int opsneeded=0;
            int len=n;
            while(len<m){
                len=len*2;
                opsneeded++;
            }
            opsneeded++;
            for(int i=0;i<=opsneeded;i++){
                if(curr.contains(s)){
                    ans=i;
                    break;
                }
                curr=curr+curr;
            }
            System.out.println(ans);
        }
    }
}
