import java.util.*;
public class two{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        String s= hariom.next();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='2'){
                System.out.print("2");
            }
        }
    }
}