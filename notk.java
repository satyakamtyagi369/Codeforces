import java.util.*;

public class notk {
    public static void satyakam() {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while (t-- > 0) {
            int n = hariom.nextInt();
            int k = hariom.nextInt();
            List<Integer> P = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                P.add(i);
            }
            List<Integer> ans = new ArrayList<>(P);
            int special = P.get(n - k);
            ans.add(special);
            for (int i = 0; i < n; i++) {
                if (i == n - k) continue;
                ans.add(P.get(i));
            }
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        hariom.close();
    }
    
    public static void main(String[] args) {
    satyakam();
    }
}