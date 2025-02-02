import java.util.*;

public class maximumdiffevenandodd {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        String s = hariom.next();
        hariom.close();

        int maxeven = 0;
        int maxodd = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                maxeven = Math.max(maxeven, freq);
            } else {
                maxodd = Math.max(maxodd, freq); 
            }
        }
        System.out.println(maxodd - maxeven);
    }
}
