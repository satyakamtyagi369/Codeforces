import java.util.*;

public class xeniaanddivisors {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int[] freq = new int[8]; 
        for (int i = 0; i < n; i++) {
            int num = hariom.nextInt();
            if (num > 7) { 
                System.out.println(-1);
                return;
            }
            freq[num]++;
        }
        hariom.close();
        List<String> result = new ArrayList<>();
        while (freq[1] > 0) {
            if (freq[2] > 0 && freq[4] > 0) {
                result.add("1 2 4");
                freq[1]--;
                freq[2]--;
                freq[4]--;
            } else if (freq[2] > 0 && freq[6] > 0) {
                result.add("1 2 6");
                freq[1]--;
                freq[2]--;
                freq[6]--;
            } else if (freq[3] > 0 && freq[6] > 0) {
                result.add("1 3 6");
                freq[1]--;
                freq[3]--;
                freq[6]--;
            } else {
                System.out.println(-1);
                return;
            }
        }
        if (freq[2] == 0 && freq[3] == 0 && freq[4] == 0 && freq[5] == 0 && freq[6] == 0 && freq[7] == 0) {
            for (String group : result) {
                System.out.println(group);
            }
        } else {
            System.out.println(-1);
        }
    }
}
