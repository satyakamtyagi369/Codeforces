
import java.util.Scanner;

public class petyaandstrings {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String a= hariom.next();
        String b= hariom.next();
        a = a.toLowerCase();
        b = b.toLowerCase();
        int result =0;
        for(int i=0;i<Math.min(a.length(),b.length());i++){
            char cha= a.charAt(i);
            char chb= b.charAt(i);
            if(cha<chb){
                result=-1;
                break;
            }
            if(cha>chb){
                result=1;
                break;
            }
        }
        if(result==0){
            if(a.length()<b.length()){
                result=-1;
            }
           else if(a.length()>b.length()){
                result=1;
            }
        }
        System.out.println(result);
    }
}
