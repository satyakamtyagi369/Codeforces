import java.util.Scanner;
public class supercentralpoint {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        for(int i=0;i<n;i++){
            x[i]=hariom.nextInt();
            y[i]=hariom.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean hasLeft = false;
            boolean hasRight = false;
            boolean hasUp = false;
            boolean hasDown = false;
            for (int j = 0; j < n; j++) {
                if (i != j) { 
                    if (x[j] > x[i] && y[i] == y[j]) {
                        hasRight = true;
                    } else if (x[j] < x[i] && y[i] == y[j]) {
                        hasLeft = true;
                    } else if (x[i] == x[j] && y[i] < y[j]) {
                        hasDown = true;
                    } else if (x[i] == x[j] && y[i] > y[j]) {
                        hasUp = true;
                    }
                }
            }
            if (hasLeft && hasRight && hasUp && hasDown) {
                count++;
            }
        }
        System.out.println(count);
    }
}
