import java.util.*;

public class thosearewithus {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while (t-- > 0) {
            int n = hariom.nextInt();
            int m = hariom.nextInt();
            int[][] matrix = new int[n][m];

            int maxVal = Integer.MIN_VALUE;
            List<int[]> maxPositions = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = hariom.nextInt();
                    if (matrix[i][j] > maxVal) {
                        maxVal = matrix[i][j];
                        maxPositions.clear();
                        maxPositions.add(new int[]{i, j});
                    } else if (matrix[i][j] == maxVal) {
                        maxPositions.add(new int[]{i, j});
                    }
                }
            }

            int answer = Integer.MAX_VALUE;

            for (int k = 0; k < maxPositions.size(); k++) {
                int[] pos = maxPositions.get(k);
                int r = pos[0];
                int c = pos[1];

                int localMax = Integer.MIN_VALUE;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        int val = matrix[i][j];
                        if (i == r || j == c) {
                            val -= 1;
                        }
                        localMax = Math.max(localMax, val);
                    }
                }

                answer = Math.min(answer, localMax);
            }

            System.out.println(answer);
        }
    }
}
