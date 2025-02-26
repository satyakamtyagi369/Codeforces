import java.util.*;
public class bankerlife {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            int n = hariom.nextInt();
            long k = hariom.nextLong();
            for (int j = 1; j <= n; j++){
                if (((j - 1) & (n - 1)) == (j - 1))
                    sb.append(k).append(" ");
                else
                    sb.append("0 ").append("");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
