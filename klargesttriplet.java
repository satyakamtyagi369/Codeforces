import java.util.*;

public class klargesttriplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        // Input arrays
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }

        // Max-heap to store sums (simulated using a PriorityQueue with reverse order)
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Calculate the sum for triplets and add it to the max heap
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    // Calculate the sum for the current triplet (i, j, l)
                    long sum = (long) a[i] * b[j] + (long) b[j] * c[l] + (long) c[l] * a[i];

                    // Add sum to the heap
                    pq.add(sum);

                    // If the size of the heap exceeds k, remove the largest element (root of max heap)
                    if (pq.size() > k) {
                        pq.poll();
                    }
                }
            }
        }

        // Now the root of the max heap contains the k-th largest sum
        System.out.println(pq.peek());
    }
}
