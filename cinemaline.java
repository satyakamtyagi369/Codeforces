import java.util.Scanner;

public class cinemaline {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int count25 = 0, count50 = 0;
        boolean possible = true;
        for (int i = 0; i < n; i++) {
            int bill = hariom.nextInt();
            if (bill == 25) {
                count25++;
            } else if (bill == 50) {
                if (count25 > 0) {
                    count25--;
                    count50++;
                } else {
                    possible = false;
                    break;
                }
            } else { 
                if (count50 > 0 && count25 > 0) {
                    count50--;
                    count25--;
                } else if (count25 >= 3) {
                    count25 -= 3;
                } else {
                    possible = false;
                    break;
                }
            }
        }
        System.out.println(possible ? "YES" : "NO");
        hariom.close();
    }
}
