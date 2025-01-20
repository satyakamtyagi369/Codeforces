import java.util.Scanner;
public class kevinandarithmetic{
    public static void main(String []args){
        Scanner hariom = new Scanner(System.in);

        int t = hariom.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = hariom.nextInt(); // Number of integers
            int[] a = new int[n];
            
            // Input array
            for (int i = 0; i < n; i++) {
                a[i] = hariom.nextInt();
            }

            // Separate even and odd numbers
            int[] evens = new int[n];
            int[] odds = new int[n];
            int evenIndex = 0, oddIndex = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    evens[evenIndex++] = a[i];
                } else {
                    odds[oddIndex++] = a[i];
                }
            }

            // Place evens first, then odds
            int[] rearranged = new int[n];
            int index = 0;
            for (int i = 0; i < evenIndex; i++) {
                rearranged[index++] = evens[i];
            }
            for (int i = 0; i < oddIndex; i++) {
                rearranged[index++] = odds[i];
            }

            // Calculate the maximum points
            int points = 0;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += rearranged[i];
                if (sum % 2 == 0) { // Check if the sum is even
                    points++;
                    // Reduce sum until it becomes odd
                    while (sum % 2 == 0) {
                        sum /= 2;
                    }
                }
            }

            // Output the result
            System.out.println(points);
        }

    }
    
}