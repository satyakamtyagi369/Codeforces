import java.util.*;
public class tl{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int m= hariom.nextInt();
        int correctsolution[]= new int[n];
        int wrongsolution[]= new int[m];
        for(int i=0;i<n;i++){
            correctsolution[i]=hariom.nextInt();
        }
        for(int i=0;i<m;i++){
            wrongsolution[i]=hariom.nextInt();
        }
        int mincorrect=Integer.MAX_VALUE;
        int maxcorrect=Integer.MIN_VALUE;
        for(int time:correctsolution){
            mincorrect=Math.min(mincorrect,time);
            maxcorrect=Math.max(maxcorrect,time);
        }
        int minwrong = Integer.MAX_VALUE;
        for(int time:wrongsolution){
            minwrong=Math.min(minwrong,time);
        }
        int v= Math.max(2*mincorrect,maxcorrect);
        if(v<minwrong){
            System.out.println(v);
        }
        else{
            System.out.println(-1);
        }
    }
}