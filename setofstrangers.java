
import java.util.*;

public class setofstrangers {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();

        while (t-- > 0) {
            int a = hariom.nextInt();
            int b = hariom.nextInt();
            int[][] arr = new int[a][b];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    arr[i][j] = hariom.nextInt();
                }
            }
            HashMap<Integer, Integer> freqMap = new HashMap<>();
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    freqMap.put(arr[i][j], freqMap.getOrDefault(arr[i][j], 0) + 1);
                }
            }
            int maxFreq = 0;
            int uniqueCount = 0;
            for (int value : freqMap.values()) {
                maxFreq = Math.max(maxFreq, value);
            }
            uniqueCount = freqMap.size(); 
            if(a==1&&b==1){
                System.out.println("0");
            }
            else{
            System.out.println(uniqueCount*2 - maxFreq);
            }
        }
    }
}

