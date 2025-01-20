import java.util.Scanner;
public class drinks {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = hariom.nextInt();
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += arr[i]; 
        }
        double result = sum / n; 
        System.out.printf("%.12f%n", result); 
    }
}
