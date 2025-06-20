import java.util.*;

public class thosearewithus {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while (t-- > 0) {
            int n = hariom.nextInt();
            int m = hariom.nextInt();
            int matrix[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = hariom.nextInt();
                }
            }

            int answer = Integer.MAX_VALUE;

            for (int r = 0; r < n; r++) {
                for (int c = 0; c < m; c++) {
                    int localmax = Integer.MIN_VALUE;

                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            int val = matrix[i][j];
                            if (i == r || j == c) {
                                val -= 1;
                            }
                            localmax = Math.max(localmax, val);
                        }
                    }

                    answer = Math.min(answer, localmax);
                }
            }

            System.out.println(answer);
        }
    }
}
