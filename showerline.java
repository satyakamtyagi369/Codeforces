import java.util.Scanner;

public class showerline {
    public static void main(String[] args) {
        int n = 5;
        int[][] g = new int[n][n];
        Scanner hariom = new Scanner(System.in);

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                g[i][j] = hariom.nextInt();
            }
        }

        int[] p = new int[n];
        int[] pans = new int[n];
        int ans = -1, tmp;

        for (int i = 0; i < n; ++i) {
            p[i] = i;
        }

        do {
            tmp = g[p[0]][p[1]] + g[p[1]][p[0]];
            tmp += g[p[2]][p[3]] + g[p[3]][p[2]];
            tmp += g[p[1]][p[2]] + g[p[2]][p[1]];
            tmp += g[p[3]][p[4]] + g[p[4]][p[3]];
            tmp += g[p[2]][p[3]] + g[p[3]][p[2]];
            tmp += g[p[3]][p[4]] + g[p[4]][p[3]];

            if (tmp > ans) {
                ans = tmp;
                System.arraycopy(p, 0, pans, 0, n);
            }
        } while (nextPermutation(p));

        System.out.println(ans);
        hariom.close();
    }

    public static boolean nextPermutation(int[] array) {
        int n = array.length;
        int i = n - 2;
        while (i >= 0 && array[i] >= array[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = n - 1;
        while (array[j] <= array[i]) {
            j--;
        }
        swap(array, i, j);
        reverse(array, i + 1, n - 1);
        return true;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }
}
