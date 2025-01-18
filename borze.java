import java.util.Scanner;
public class borze {
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        String notations = hariom.next();
        StringBuilder queue = new StringBuilder();
        for (int i = 0; i < notations.length(); i++) {
            if (notations.charAt(i) == '.') {
                queue.append('0');
            } else if (notations.charAt(i) == '-' && i + 1 < notations.length()) {
                if (notations.charAt(i + 1) == '.') {
                    queue.append('1');
                    i++; 
                } else if (notations.charAt(i + 1) == '-') {
                    queue.append('2');
                    i++; 
                }
            }
        }
        System.out.print(queue.toString());
    }
}
