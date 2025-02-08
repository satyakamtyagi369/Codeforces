import java.util.*;

public class bibatcoders {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();

        int[] P = new int[n]; 
        int[] Q = new int[n]; 
        int[] bibMap = new int[n + 1]; 

        for (int i = 0; i < n; i++) {
            P[i] = hariom.nextInt();
        }

        for (int i = 0; i < n; i++) {
            Q[i] = hariom.nextInt();
        }

        int[] bibPosition = new int[n + 1]; 
        for (int i = 0; i < n; i++) {
            bibPosition[Q[i]] = i;
        }

        for (int i = 1; i <= n; i++) {
            int staringAtPersonIndex = P[bibPosition[i]] - 1;
            System.out.print(Q[staringAtPersonIndex] + " ");
        }
    }
}
