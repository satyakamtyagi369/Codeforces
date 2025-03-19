import java.io.*;
import java.util.*;
  
public class evenor {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        long totalOR = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            totalOR |= arr[i];
        }
        if(n % 2 == 0) {
            out.println(totalOR);
            out.flush();
            return;
        }
        int[] bitFreq = new int[30];
        for (int i = 0; i < n; i++) {
            for(int b = 0; b < 30; b++){
                if((arr[i] & (1 << b)) != 0){
                    bitFreq[b]++;
                }
            }
        }
        long best = 0;
        for (int i = 0; i < n; i++) {
            long candidate = totalOR;
            for (int b = 0; b < 30; b++) {
                if((arr[i] & (1 << b)) != 0 && bitFreq[b] == 1){
                    candidate &= ~(1L << b);
                }
            }
            best = Math.max(best, candidate);
        }
        out.println(best);
        out.flush();
    }
}
