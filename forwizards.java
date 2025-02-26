import java.util.*;
public class forwizards {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while(t-- > 0){
            int n = hariom.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++){
                a[i] = hariom.nextInt();
            }
            int bestDelta = 0;
            int bestL = 0, bestR = 0;
            for (int l = 0; l < n; l++){
                int countGreater = 0, countLess = 0;
                for (int r = l + 1; r < n; r++){
                    if(a[r] > a[l])
                        countGreater++;
                    else if(a[r] < a[l])
                        countLess++;
                    int delta = countGreater - countLess;
                    if(delta < bestDelta){
                        bestDelta = delta;
                        bestL = l;
                        bestR = r;
                    }
                }
            }
            System.out.println((bestL + 1) + " " + (bestR + 1));
        }
    }
}
