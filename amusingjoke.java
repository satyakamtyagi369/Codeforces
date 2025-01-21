
import java.util.Arrays;
import java.util.Scanner;

public class amusingjoke {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String a= hariom.next();
        String b= hariom.next();
        String c= hariom.next();
        StringBuilder result1= new StringBuilder();
        StringBuilder result2= new StringBuilder();
        int sizeab=a.length() + b.length();
        if(c.length()==sizeab){
            for(int i=0;i<a.length();i++){
                result1.append(a.charAt(i));
            }
            for(int i=0;i<b.length();i++){
                result1.append(b.charAt(i));
            }
            for(int i=0;i<c.length();i++){
                result2.append(c.charAt(i));
            }
            char[] resultArray2 = result2.toString().toCharArray();
            Arrays.sort(resultArray2);
            char[] resultArray1 = result1.toString().toCharArray();
            Arrays.sort(resultArray1);
       //     result = new StringBuilder(new String(resultArray));
       boolean result = true;
       for(int i=0;i<resultArray1.length;i++){
        if(resultArray1[i]!=resultArray2[i]){
            result = false;
        }
       }
       if(result){
        System.out.println("YES");
       }
       else{
        System.out.println("NO");
       }
        }
        else{
            System.out.println("NO");
        }
    }
}
