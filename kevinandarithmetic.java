import java.util.Scanner;
public class kevinandarithmetic{
    public static void main(String []args){
        Scanner hariom = new Scanner(System.in);
        int t = hariom.nextInt(); 
        while (t-- > 0) {
            int n = hariom.nextInt(); 
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = hariom.nextInt();
            }
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
            int[] rearranged = new int[n];
            int index = 0;
            for (int i = 0; i < evenIndex; i++) {
                rearranged[index++] = evens[i];
            }
            for (int i = 0; i < oddIndex; i++) {
                rearranged[index++] = odds[i];
            }
            int points = 0;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += rearranged[i];
                if (sum % 2 == 0) { 
                    points++;
                    while (sum % 2 == 0) {
                        sum /= 2;
                    }
                }
            }
            System.out.println(points);
        }

    }
    
}