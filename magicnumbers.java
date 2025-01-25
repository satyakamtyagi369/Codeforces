import java.util.Scanner;
public class magicnumbers{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        String s= hariom.next();
       
        boolean result=true;
        
        for (int i = 0; i < s.length(); ) {
            if (i + 2 < s.length() && s.substring(i, i + 3).equals("144")) {
                i += 3; 
            } else if (i + 1 < s.length() && s.substring(i, i + 2).equals("14")) {
                i += 2; 
            } else if (s.charAt(i) == '1') {
                i++; 
            } else {
                result = false;
                break;
            }
        }
        if(result){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}