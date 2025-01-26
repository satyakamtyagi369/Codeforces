
import java.util.Scanner;

public class stringtask {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String s= hariom.next();
        s=s.toLowerCase();
        StringBuilder result= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y')){
                result.append(".").append(ch);
            }
        }
        System.out.println(result);
    }
}
