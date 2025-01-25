import java.util.*;

public class atcodersa {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int[] v = new int[5];
        int[] s = new int[5];
        int a = 0, b = 0;

        for (int i = 0; i < 5; i++) {
            int temp = hariom.nextInt();
            v[i] = temp;
            s[i] = temp;
        }
        hariom.close();

        Arrays.sort(v);

        for (b = 0; b < 4; b++) {
            if (s[b] > s[b + 1]) {
                int temp = s[b];
                s[b] = s[b + 1];
                s[b + 1] = temp;
                break;
            }
        }

        for (a = 0; a < 5; a++) {
            if (s[a] != v[a]) {
                System.out.println("No");
                return;
            }
        }

        if (a == 5 && b != 4) {
            System.out.println("Yes");
        } else if (a == 5 && b == 4) {
            System.out.println("No");
        }
    }
}
