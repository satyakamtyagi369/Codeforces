import java.util.Scanner;
public class ultrafastmathematician {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String a = hariom.next();
        String b = hariom.next();
        char newab[] = new char[a.length()];
        for(int i=0;i<a.length();i++){
            char cha=a.charAt(i);
            char chb=b.charAt(i);
            if(cha == chb) {
                newab[i] = '0';
            } else {
                newab[i] = '1';
            }
            System.out.print(newab[i]);
        }
    }
}
