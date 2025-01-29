import java.util.*;
public class littlegirlandgame{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        String s= hariom.next();
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch -'a']++;
        }
        int oddcount=0;
        for(int i=0;i<26;i++){
            if(freq[i]%2!=0){
                oddcount++;
            }
        }
        if(oddcount<=1){
            System.out.println("First");
        }
        else{
            if(oddcount%2==0){
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
        }
    }
}