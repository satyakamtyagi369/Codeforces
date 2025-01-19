
import java.util.Scanner;

public class stonesonthetable {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        String s= hariom.next();
        int count=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
