import java.util.*;
public class unluckyticket {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        String ticket = hariom.next();
        char[] firstHalf = ticket.substring(0, n).toCharArray();
        char[] secondHalf = ticket.substring(n).toCharArray();
        Arrays.sort(firstHalf);
        Arrays.sort(secondHalf);
        boolean strictlyLess = true;
        boolean strictlyMore = true;
        for (int i = 0; i < n; i++) {
            if (firstHalf[i] >= secondHalf[i]) {
                strictlyLess = false;
            }
            if (firstHalf[i] <= secondHalf[i]) {
                strictlyMore = false;
            }
        }
        if (strictlyLess || strictlyMore) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}