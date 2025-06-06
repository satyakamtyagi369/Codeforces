import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class twolargebags {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while (t-- > 0) {
            int n = hariom.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(hariom.nextInt());
            }
            if (canEqualize(list)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean canEqualize(ArrayList<Integer> list) {
        while (!list.isEmpty()) {
            Collections.sort(list);
            int v = list.get(0);
            int count = 0;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i) == v) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == 1) {
                return false;
            }
            for (int i = 0; i < count; i++) {
                list.remove(0);
            }
            if (count > 2) {
                int surplus = count - 2;
                for (int i = 0; i < surplus; i++) {
                    list.add(v + 1);
                }
            }
        }
        return true;
    }
}
