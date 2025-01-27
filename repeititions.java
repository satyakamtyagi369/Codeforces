
import java.util.Scanner;

public class repeititions {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String s= hariom.next();
        int maxlength=1;
        int currentlength=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                currentlength++;
            }
            else{
                maxlength=Math.max(maxlength,currentlength);
                currentlength=1;
            }
        }
        maxlength=Math.max(maxlength,currentlength);
        System.out.println(maxlength);
        
    }
}
