import java.util.*;
public class chatroom{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        String s= hariom.next();
        String target="hello";
        if(s.length()<5){
            System.out.println("NO");
            return;
        }
       int j=0;
       for(int i=0;i<s.length() && j<target.length();i++){
        if(s.charAt(i)==target.charAt(j)){
            j++;
        }
       }
       if(j==target.length()){
        System.out.println("YES");
       }
       else{
        System.out.println("NO");
       }
    }
}