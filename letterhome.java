import java.util.*;
public class letterhome{
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t-->0){
            int n=hariom.nextInt();
            int s=hariom.nextInt();
            int left = Integer.MAX_VALUE;
            int right=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                int x= hariom.nextInt();
                if(x<left){
                    left=x;
                }
                if(x>right){
                    right=x;
                }
            }
            int sub = right-left;
            int toleft= Math.abs(s-left);
            int toright=Math.abs(s-right);
            int ans=sub + Math.min(toleft,toright);
            System.out.println(ans);
        }
    }
}