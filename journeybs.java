
import java.util.Scanner;

public class journeybs {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t-->0){
            long n= hariom.nextLong();
            long a= hariom.nextLong();
            long b= hariom.nextLong();
            long c= hariom.nextLong();

            long low=1;
            long high = n;
            long ans = n;
            while(low<=high){
                long mid = low+(high-low)/2;
                if(canreach(mid,a,b,c,n)){
                    ans = mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            System.out.println(ans);
        }
    }
        private static boolean canreach(long days,long a, long b, long c, long n){
            long fullcycle = days/3;
            long remainingDays = days%3;
            long distance = fullcycle*(a+b+c);
            if(remainingDays>=1){
                distance = distance + a;
            }
            if(remainingDays>=2){
                distance = distance + b;
            }
            return distance>=n;
        }
}
