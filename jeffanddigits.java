
import java.util.Scanner;

public class jeffanddigits {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = hariom.nextInt();
        }
        
        int count5 = 0;
        int count0 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 5) {
                count5++;
            } else if (arr[i] == 0) {
                count0++;
            }
        }
        
        if (count0 == 0) {
            System.out.println("-1");
            return;
        }
        
        if (count5 < 9) {
            System.out.println("0");
            return;
        }

        count5 =count5 - count5 % 9;

        for (int i = 0; i < count5; i++) {
            System.out.print("5");
        }

        for (int i = 0; i < count0; i++) {
            System.out.print("0");
        }
    }
}
