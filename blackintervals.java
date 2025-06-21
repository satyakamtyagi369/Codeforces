import java.util.*;
public class blackintervals {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int q= hariom.nextInt();
        int arr[]= new int[q];
        for(int i=0;i<q;i++){
            arr[i]= hariom.nextInt();
        }
        boolean[] black = new boolean[n + 2];
        int intervals = 0;
        for (int i = 0; i < q; i++) {
            int index = arr[i];
            if (!black[index]) {
                if (!black[index - 1]&& !black[index + 1]) {
                    intervals++;
                } else if (black[index - 1]&& black[index + 1]) {
                    intervals--;
                }
                black[index] = true;
            } else {
                if (!black[index - 1]&& !black[index + 1]) {
                    intervals--;
                } else if (black[index - 1]&& black[index + 1]) {
                    intervals++;
                }
                black[index] = false;
            }
            System.out.println(intervals);
        }
    }
}
