import java.util.*;

public class twostring {
    public static void hariom() {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        String[] v = new String[n];
        
        for (int i = 0; i < n; i++) {
            v[i] = hariom.next();
        }
        
        Arrays.sort(v, Comparator.comparingInt(String::length));

        StringBuilder ans = new StringBuilder();
        for (String s : v) {
            ans.append(s);
        }
        
        System.out.println(ans);
    }

    public static void main(String[] args) {
        hariom();
    }
}
