import java.util.Scanner;

public class increaseanddecrease {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        // Reading input and calculating sum
        for (int i = 0; i < n; i++) {
            arr[i] = hariom.nextInt();
            sum += arr[i];
        }

        // Check if it's possible to evenly distribute the sum
        if (sum % n != 0) {
            System.out.println(-1); // If it's not divisible evenly
            return;
        }

        int target = sum / n;
        int count = 0;

        // Iterate through the array and balance elements with their neighbors
        for (int i = 0; i < n - 1; i++) {
            int diff = arr[i] - target;
            
            // Transfer the excess or deficit to the next element
            arr[i] -= diff;
            arr[i + 1] += diff;
            
            // Count how many changes we made
            count += Math.abs(diff);
        }

        System.out.println(count);  // Output the result
    }
}
