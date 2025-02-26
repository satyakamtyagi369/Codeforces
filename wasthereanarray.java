import java.util.Scanner;

public class wasthereanarray {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();

        while (t-- > 0) {
            int n = hariom.nextInt();
            int[] brr = new int[n - 2];

            for (int i = 0; i < n - 2; i++) {
                brr[i] = hariom.nextInt();
            }

            boolean possible = true;
            for (int i = 1; i < n - 3; i++) {
                if (brr[i] == 0 && brr[i - 1] == 1 && brr[i + 1] == 1) {
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}
