import java.util.Scanner;
public class pythagoreantheorm{
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
              //  System.out.println("i: "+i+" j:"+j);
                int sum = i*i + j*j;
               // System.out.println("sum: "+sum);
               int k=(int) Math.sqrt(sum);
                if(k*k==sum&&k<=n){
                    count=count+1;
                }
               // System.out.println("count: "+count);
            }
        }
        System.out.println(count);
    }
}