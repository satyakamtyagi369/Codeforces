
import java.util.Scanner;

public class asciirainwatertrap {
    public static int trappedwater(String s){
        int n=s.length();
        int height[] = new int[n];
        for(int i=0;i<n;i++){
            height[i]=(int)s.charAt(i);
        }
        int leftmax[]= new int[n];
        int rightmax[]= new int[n];
        leftmax[0]=height[0];
        rightmax[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        int water =0;
        for(int i=0;i<n;i++){
            water = water + Math.min(leftmax[i],rightmax[i]) - height[i];
        }
        return water;
    }
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String s= hariom.nextLine();
        System.out.println(trappedwater(s));
    }
}
