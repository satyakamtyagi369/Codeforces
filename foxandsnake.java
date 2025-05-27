
import java.util.Scanner;

public class foxandsnake {
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int m = hariom.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= m; j++) {
                    System.out.print("#");
                }
            } else {
                if (i % 4 == 0) {
                    System.out.print("#");
                    for (int j = 1; j < m; j++) {
                        System.out.print(".");
                    }
                    
                } else {
                    for (int j = 1; j < m; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
