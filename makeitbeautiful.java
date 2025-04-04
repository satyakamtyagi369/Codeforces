import java.util.*;
public class makeitbeautiful {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        outer:
        while (t-- > 0) {
            int n = hariom.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = hariom.nextInt();
            }
            boolean allEqual = true;
            for (int i = 1; i < n; i++) {
                if (a[i] != a[0]) {
                    allEqual = false;
                    break;
                }
            }
            if (allEqual) {
                System.out.println("NO");
                continue;
            }
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = a[i];
            }
            Arrays.sort(arr, Collections.reverseOrder());

            long prefixSum = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == prefixSum) {
                    boolean found = false;
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] != prefixSum) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("NO");
                        continue outer;
                    }
                }
                prefixSum += arr[i];
            }
            System.out.println("YES");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(arr[i]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
