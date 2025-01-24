import java.util.Scanner;

public class littleelephantandrojdil {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int s = hariom.nextInt();
        int arr[] = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = hariom.nextInt();
        }
     
        int minelement = Integer.MAX_VALUE;
        int minIndex = -1;
        boolean stillrojdil = false;
        for (int i = 0; i < s; i++) {
            if (arr[i] < minelement) {
                minelement = arr[i];
                minIndex = i + 1;
                stillrojdil = false;
            } else if (arr[i] == minelement) {
                stillrojdil = true;
            }
        }
        if (stillrojdil) {
            System.out.println("Still Rozdil");
        } else {
            System.out.println(minIndex);
        }
    }
}
