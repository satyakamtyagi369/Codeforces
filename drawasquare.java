import java.util.*;
public class drawasquare{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t-->0){
            int l=hariom.nextInt();
            int r=hariom.nextInt();
            int d=hariom.nextInt();
            int u=hariom.nextInt();
           if(l==r && r==d && d==u){
            System.out.println("YES");
           }
           else{
            System.out.println("NO");
           }
        }
    }
}