import java.util.*;
public class romaandluckynumbers{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int k = hariom.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int num = hariom.nextInt();
            int luckycount=0;
            while(num>0){
                int digit = num % 10;
                if(digit == 4|| digit == 7){
                    luckycount++;
                }
                num = num / 10;
            }
            if(luckycount <=k ){
                count++;
            }
        }
        System.out.println(count);
    }
}