import java.util.Scanner;

public class footballa {
    public static void main(String[] args) {
        Scanner hariom= new Scanner(System.in);
        String s= hariom.next();
        int count0=0;
        int count1=1;
        boolean result=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count0++;
                count1=0;
                if(count0==7){
                    result=true;
                    break;
                }
            }
            else if(s.charAt(i)=='1'){
                count1++;
                count0=0;
                if(count1==7){
                    result=true;
                    break;
                }
            }
        }
        if(!result){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
