import java.util.*;

public class colourfulbracketsequence {
    public static void hariom() {
        Scanner hariom = new Scanner(System.in);
        String s = hariom.next();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '<') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    System.out.println("No");
                    hariom.close();
                    return;
                }
                char top = st.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '>' && top != '<')) {
                    System.out.println("No");
                    hariom.close();
                    return;
                }
            }
        }

        System.out.println(st.isEmpty() ? "Yes" : "No");
    }

    public static void main(String[] args) {
        hariom();
    }
}
