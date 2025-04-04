import java.util.*;
public class cloudberryjam{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t-->0){
            int n= hariom.nextInt();
            System.out.println(((n*3) + n)/2);
        }
    }
}