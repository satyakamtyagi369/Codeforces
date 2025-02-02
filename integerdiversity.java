import java.util.*;

public class integerdiversity {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt();
        while (t-- > 0) {
            int s = hariom.nextInt();
            int arr[] = new int[s];
            for (int i = 0; i < s; i++) {
                arr[i] = hariom.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                int absval = Math.abs(arr[i]);
                map.put(absval, map.getOrDefault(absval, 0) + 1);
            }

            int count = 0;
            List<Integer> keys = new ArrayList<>(map.keySet());

            for (int i = 0; i < keys.size(); i++) {
                int key = keys.get(i);
                if (key == 0) {  
                    count += 1;
                } else {
                    count += Math.min(2, map.get(key));
                }
            }

            System.out.println(count);
        }
        hariom.close();
    }
}
