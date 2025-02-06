import java.util.*;
public class serejaandsuffices {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int m = hariom.nextInt();
        int[] a = new int[n + 1];  
        int[] distinctCount = new int[n + 1]; 
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            a[i] = hariom.nextInt();
        }
        for (int i = n; i >= 1; i--) {
            uniqueNumbers.add(a[i]);
            distinctCount[i] = uniqueNumbers.size();
        }
        while (m-- > 0) {
            int li = hariom.nextInt();
            System.out.println(distinctCount[li]);
        }
    }
}
