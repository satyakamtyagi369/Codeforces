import java.util.*;
public class sleuth{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        String s= hariom.nextLine().replace("?", "").trim().toLowerCase();
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if("aeiouy".indexOf(ch) !=-1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            break;
        }
    }
}