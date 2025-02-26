import java.util.*;

public class debug {
    public static void hariom() {
        Scanner hariom = new Scanner(System.in);
        String S = hariom.next();
        int n = S.length();
        
        TreeSet<Integer> st = new TreeSet<>();
        for (int i = 0; i < n - 1; i++) {
            if (S.charAt(i) == 'W' && S.charAt(i + 1) == 'A') {
                st.add(i);
            }
        }

        StringBuilder sb = new StringBuilder(S);
        
        while (!st.isEmpty()) {
            int i = st.first();
            st.remove(i);
            if (!(sb.charAt(i) == 'W' && sb.charAt(i + 1) == 'A')) continue;
            
            sb.setCharAt(i, 'A');
            sb.setCharAt(i + 1, 'C');
            
            if (i - 1 >= 0 && i - 1 < n - 1 && sb.charAt(i - 1) == 'W' && sb.charAt(i) == 'A') {
                st.add(i - 1);
            }
            if (i + 1 < n - 1 && sb.charAt(i + 1) == 'W' && sb.charAt(i + 2) == 'A') {
                st.add(i + 1);
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        hariom();
    }
}
