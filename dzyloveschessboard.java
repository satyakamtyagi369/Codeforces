import java.util.Scanner;

public class dzyloveschessboard {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int m = hariom.nextInt();
        hariom.nextLine(); 

        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            board[i] = hariom.nextLine().toCharArray();
        }

        char[][] result = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == '-') {
                    result[i][j] = '-'; 
                } else {
                    if ((i + j) % 2 == 0) {
                        result[i][j] = 'B';
                    } else {
                        result[i][j] = 'W';
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

        hariom.close();
    }
}
