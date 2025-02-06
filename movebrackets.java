import java.util.*;

public class movebrackets {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while (t-- > 0) {
            int n = hariom.nextInt();
            String s = hariom.next();
            Stack<Character> stack = new Stack<>();
            int count = 0;
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == '(') {
                    stack.push(ch);
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop(); 
                    } else {
                        count++;  
                    }
                }
            }
            System.out.println(count);
         }
    }
}
