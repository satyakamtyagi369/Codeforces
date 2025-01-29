import java.util.*;

public class jeffandperiods {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = hariom.nextInt();
        }
        
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        List<Integer> list = new ArrayList<>(set);
        int diff = 0;
        boolean[] processed = new boolean[list.size()];
        boolean isAP = true;

        boolean overallIsAP = true;

        System.out.println(set.size());

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            int prevIndex = -1; 
            isAP = true;
            diff = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    if (prevIndex == -1) {
                        prevIndex = j; 
                    } else {
                        int currentDiff = j - prevIndex;
                        if (diff == 0) {
                            diff = currentDiff; 
                        } else if (currentDiff != diff) {
                            isAP = false; 
                            break;
                        }
                        prevIndex = j;
                    }
                }
            }

            if (!isAP) {
                overallIsAP = false;
                break;
            }

            if (isAP) {
                processed[i] = true;
                if (diff == 0) {
                    System.out.println(num + " " + 0);  
                } else {
                    System.out.println(num + " " + diff);  
                }
            }
        }

        if (!overallIsAP) {
            System.out.println(0);
        } else {
            boolean allProcessed = true;
            for (int i = 0; i < list.size(); i++) {
                if (!processed[i]) {
                    allProcessed = false;
                    break;
                }
            }
            if (!allProcessed) {
                System.out.println(0);
            }
        }
    }
}
