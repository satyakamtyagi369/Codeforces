import java.util.*;
public class differentdivisors {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while (t-- > 0) {
            int d = hariom.nextInt();
            int count = 0;
            for (int i = 6; ; i++) {
                List<Integer> divisors = new ArrayList<>();
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        divisors.add(j);
                    }
                }
                count = 0; 
                for (int j = 1; j < divisors.size(); j++) {
                    if (divisors.get(j) - divisors.get(j - 1) >= d) {
                        count++;
                    }
                    if (count == 3) {
                        System.out.println(i);
                        break;
                    }
                }
                if (count == 3) {
                    break; 
                }
            }
        }
    }
}
