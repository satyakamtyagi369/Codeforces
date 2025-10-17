import java.util.Scanner;

public class journey {
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t-->0){
            long n= hariom.nextLong();
            long a= hariom.nextLong();
            long b= hariom.nextLong();
            long c= hariom.nextLong();
            
            long cycle = a+b+c;
            long fullCycles = n / cycle;
            long remainingDays = n % cycle;
            long days = fullCycles*3;
            if(remainingDays > 0) {
                remainingDays -= a;
                days++;
            }
            if(remainingDays > 0) {
                remainingDays -= b;
                days++;
            }
            if(remainingDays > 0) {
                remainingDays -= c;
                days++;
            }
            System.out.println(days);
        }
    }
}
