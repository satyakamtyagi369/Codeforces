import java.util.*;
public class skibidus{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int t = Integer.parseInt(hariom.nextLine().trim()); 
        while (t-- > 0) {
            String w = hariom.nextLine().trim(); 
            if (w.endsWith("us")) {
                String plural = w.substring(0, w.length() - 2) + "i";
                System.out.println(plural);
            }
        }
    }
}