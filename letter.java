import java.util.*;

public class letter {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String s1 = hariom.nextLine();
        String s2 = hariom.nextLine();
        hariom.close();
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            if (ch != ' ') {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
        }
        for (char ch : s2.toCharArray()) {
            if (ch != ' ') {
                if (!freq.containsKey(ch) || freq.get(ch) == 0) {
                    System.out.println("NO");
                    return;
                }
                freq.put(ch, freq.get(ch) - 1);
            }
        }

        System.out.println("YES");
    }
}
