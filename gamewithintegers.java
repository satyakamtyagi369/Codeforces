
import java.util.*;
public class gamewithintegers{
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t=hariom.nextInt();
        while(t-->0){
            int n= hariom.nextInt();
            if(n%3==0){
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
        }
    }
   
}

