import java.util.*;
import java.util.stream.Collectors;

public class PotatoBags {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int y = hariom.nextInt();
        int k = hariom.nextInt();
        int n = hariom.nextInt();
        List<Integer> possibleX = new ArrayList<>();
        int firstX = (k - (y % k)) % k;
        firstX = firstX == 0 ? k : firstX; 
        
        for (int x = firstX; x <= n - y; x += k) {
            possibleX.add(x);
        }
        
        if (possibleX.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(possibleX.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }
}
