
import java.util.Scanner;

public class bigsegment {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int segments[][]=new int[n][2];
        int minleft=Integer.MAX_VALUE;
        int maxright=Integer.MIN_VALUE;
        int minleftindex=-1;
        int minrightindex=-1;
        for(int i=0;i<n;i++){
            segments[i][0]=hariom.nextInt();
            segments[i][1]=hariom.nextInt();
            if(segments[i][0]<minleft){
                minleft=segments[i][0];
                minleftindex=i;
            }
            if(segments[i][1]>maxright){
                maxright=segments[i][1];
                minrightindex=i;
            }
        }
        for(int i=0;i<n;i++){
            if(segments[i][0]==minleft&&segments[i][1]==maxright){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(-1);
    }
}
