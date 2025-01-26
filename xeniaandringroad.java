
import java.util.Scanner;

public class xeniaandringroad {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int m = hariom.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = hariom.nextInt();
        }
        long time = 0;
        int current = 1;
        for (int i = 0; i < m; i++) {
            if (arr[i] >= current) {
                time += arr[i] - current;
            } else {
                time += n - current + arr[i];
            }
            current = arr[i];
        }
        System.out.println(time);
    }
}
