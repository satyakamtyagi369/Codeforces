import java.util.Scanner;

public class painttomakearectangle {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int H = hariom.nextInt();
        int W = hariom.nextInt();
        hariom.nextLine(); 
        char[][] grid = new char[H][W];
        for (int i = 0; i < H; i++) {
            grid[i] = hariom.nextLine().toCharArray();
        }
        int minRow = H, maxRow = -1, minCol = W, maxCol = -1;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (grid[i][j] == '#') {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }
        for (int i = minRow; i <= maxRow; i++) {
            for (int j = minCol; j <= maxCol; j++) {
                if (grid[i][j] == '.') {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}
