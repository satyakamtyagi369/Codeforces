import java.util.Scanner;
public class hq{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        String s= hariom.next();
        boolean result=false;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            
            if(ch=='H'||ch=='Q'||ch=='9'){
                result=true;
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