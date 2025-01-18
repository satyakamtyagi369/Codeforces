import java.util.Scanner;

public class queueattheschool {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int s = hariom.nextInt(); // Number of students
        int t = hariom.nextInt(); // Number of seconds
        String string = hariom.next();
        
        StringBuilder queue = new StringBuilder(string);

        for (int time = 0; time < t; time++) {
            for (int i = 1; i < s; i++) {
                if (queue.charAt(i) == 'G' && queue.charAt(i - 1) == 'B') {
                   
                    queue.setCharAt(i - 1, 'G');
                    queue.setCharAt(i, 'B');
                    i++; 
                }
            }
        }

        System.out.println(queue);
    }
}
