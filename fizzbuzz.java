import java.util.*;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        long t = hariom.nextInt(); 
        
       
            while (t-- > 0) {
                long n = hariom.nextLong();
                long temp = n / 15;
                long count = n % 15;
                long nex = Math.min(3, count + 1);
                System.out.println(temp * 3 + nex);
            }
        
    }
}
