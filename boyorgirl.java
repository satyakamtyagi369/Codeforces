import java.util.HashSet;
import java.util.Scanner;
public class boyorgirl{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        String s= hariom.next();
        HashSet set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }
        if(set.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}