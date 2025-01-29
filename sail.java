import java.util.Scanner;

public class sail {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        int sx = hariom.nextInt();
        int sy = hariom.nextInt();
        int ex = hariom.nextInt();
        int ey = hariom.nextInt();
        String s = hariom.next();
        
        int count = 0;
        for (int i = 0; i < t; i++) {
            char ch = s.charAt(i);
            if (ch == 'N' && sy < ey) {
                sy++;
            } else if (ch == 'S' && sy > ey) {
                sy--;
            } else if (ch == 'E' && sx < ex) {
                sx++;
            } else if (ch == 'W' && sx > ex) {
                sx--;
            }
            
            count++;
            
            if (sx == ex && sy == ey) {
                System.out.println(count);
                return;
            }
        }
        
        System.out.println("-1");
    }
}
