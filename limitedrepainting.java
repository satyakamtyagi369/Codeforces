import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class limitedrepainting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            String s = br.readLine();
            long[] a = new long[n];
            st = new StringTokenizer(br.readLine());
            long maxA = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
                if(a[i] > maxA) maxA = a[i];
            }
            long low = 0, high = maxA, ans = high;
            while(low <= high) {
                long mid = (low + high) / 2;
                int segments = 0;
                int i = 0;
                while(i < n) {
                    if(a[i] > mid && s.charAt(i)=='R'){
                        i++;
                        continue;
                    }
                    boolean hasRequired = false;
                    int j = i;
                    while(j < n && !(a[j] > mid && s.charAt(j)=='R')){
                        if(a[j] > mid && s.charAt(j)=='B'){
                            hasRequired = true;
                        }
                        j++;
                    }
                    if(hasRequired) segments++;
                    i = j;
                }
                if(segments <= k){
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
