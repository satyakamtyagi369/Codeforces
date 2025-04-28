import java.util.*;
public class sentencewordsreverse{
    public static String reversed(String word){
        StringBuilder str= new StringBuilder(word);
        return str.reverse().toString();
    }
    public static String reversesentence(String s){
     s= s.trim();
     String words[]= s.split("\\s+");
     StringBuilder str = new StringBuilder();
     for(int i=words.length-1;i>=0;i--){
        str.append(reversed(words[i]));
        if(i!=0){
            str.append(" ");
        }
     }
     return str.toString();

    }
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        String s= "my name is Satyakam Tyagi";
        System.out.println(reversesentence(s));
    }
}