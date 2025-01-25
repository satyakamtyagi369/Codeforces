import java.util.Scanner;
public class translation {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String s= hariom.next();
        String t= hariom.next();
        if(s.length()!=t.length()){
            System.out.println("NO");
        }else{

        
        Character ch[] = new Character[s.length()];
        for(int i=0;i<s.length();i++){
             ch[i]=s.charAt(s.length()-i-1);// for reversing
          //   System.out.print(ch[i]);
        }
        Character cht[]=new Character[t.length()];
        for(int i=0;i<t.length();i++){
            cht[i]=t.charAt(i);
        }
        boolean result=false;
        for(int i=0;i<t.length();i++){
            if(cht[i].equals(ch[i])){
                result=true;
            }
            else{
                result=false;
                break;
            }
        }
        if(result==true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
}
