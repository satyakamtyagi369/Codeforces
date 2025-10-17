import java.util.*;
public class atcoder208a {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while(t-->0){
        int n= hariom.nextInt();
        int k= hariom.nextInt();
        long cal = (long)n - (long)k;
        if(cal<=0){
            System.out.println(-1);
        }else if(((cal^n)%cal)==k){
            System.out.println(cal);
        }
        else{
            System.out.println(-1);
        }
    }
    }
}