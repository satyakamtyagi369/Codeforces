import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class doremyspaint {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while (t-- > 0) {
            int n = hariom.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = hariom.nextInt();
            }
            Map<Integer,Integer> freq = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int v = arr[i];
                freq.put(v, freq.getOrDefault(v, 0) + 1);
            }
            boolean flag = false;
            int distinct = freq.size();
            if (distinct == 1) {
                flag = true;
            } else if (distinct == 2) {
                int oddCount  = (n + 1) / 2;
                int evenCount = n / 2;
                Integer[] counts = freq.values().toArray(new Integer[0]);
                int c1 = counts[0];
                int c2 = counts[1];
                if ((c1 == oddCount && c2 == evenCount) ||
                    (c2 == oddCount && c1 == evenCount)) {
                    flag = true;
                }
            }
            System.out.println(flag ? "Yes" : "No");
        }
    }
}
