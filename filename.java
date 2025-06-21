import java.util.*;
public class filename {
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int s = hariom.nextInt();
        String str = hariom.next();
        int count = 0;
        int remove = 0;
        for(int i = 0; i < s; i++) {
            if(str.charAt(i) == 'x') {
                count++;
                if(count >= 3) {
                    remove++;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(remove);
    }
}
