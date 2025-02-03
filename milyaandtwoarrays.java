import java.util.*;

public class milyaandtwoarrays {
    public static void solve(Scanner hariom) {
        int n = hariom.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set1.add(hariom.nextInt());
        }
        for (int i = 0; i < n; i++) {
            set2.add(hariom.nextInt());
        }

        if (set1.size() == 2 && set2.size() == 2) {
            System.out.println("YES");
        } else if (set1.size() == 1 && set2.size() == 1) {
            System.out.println("NO");
        } else if ((set1.size() == 1 && set2.size() == 2) || (set1.size() == 2 && set2.size() == 1)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while (t-- > 0) {
            solve(hariom);
        }
    }
}
