import java.util.*;
public class ambitiouskid{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int minops = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int a = hariom.nextInt();
            int ops = Math.abs(a);
            if (ops < minops) {
                minops = ops;
                if (minops == 0) break;
            }
        }
        
        System.out.println(minops);
    }
}