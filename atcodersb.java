import java.util.Scanner;

public class atcodersb {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = hariom.nextLong();
        }
        hariom.close();

        if (n < 2) {
            System.out.println("YES");
            return;
        }

        if (arr[0] == 0) {
            System.out.println("NO");
            return;
        }

        double ratio = (double) arr[1] / arr[0];
        boolean result = true;

        for (int i = 1; i < n - 1; i++) {
            if ((double) arr[i + 1] / arr[i] != ratio) {
                result = false;
                break;
            }
        }

        System.out.println(result ? "YES" : "NO");
    }
}
