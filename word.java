
import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String s = hariom.next();
        int countupper=0;
            int countlower=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            
            if(Character.isUpperCase(ch)){
                countupper++;
            }
            if(Character.isLowerCase(ch)){
                countlower++;
            }
        }
        if(countlower>=countupper){
            System.out.println(s.toLowerCase());
        }
        else{
            System.out.println(s.toUpperCase());
        }
    }
}
