import java.util.*;

public class cakeminator {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int r = hariom.nextInt();
        int c = hariom.nextInt();
        hariom.nextLine();

        char[][] cake = new char[r][c];
        for (int i = 0; i < r; i++) {
            cake[i] = hariom.nextLine().toCharArray();
        }

        boolean[][] eaten = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            boolean hasStrawberry = false;
            for (int j = 0; j < c; j++) {
                if (cake[i][j] == 'S') {
                    hasStrawberry = true;
                    break;
                }
            }
            if (!hasStrawberry) {
                for (int j = 0; j < c; j++) {
                    eaten[i][j] = true;
                }
            }
        }

        for (int j = 0; j < c; j++) {
            boolean hasStrawberry = false;
            for (int i = 0; i < r; i++) {
                if (cake[i][j] == 'S') {
                    hasStrawberry = true;
                    break;
                }
            }
            if (!hasStrawberry) {
                for (int i = 0; i < r; i++) {
                    eaten[i][j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (eaten[i][j]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
