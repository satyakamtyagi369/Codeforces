
import java.util.*;

public class dimaandfriends {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int s= hariom.nextInt();
        int arr[]= new int[s];
        for(int i=0;i<s;i++){
            arr[i]= hariom.nextInt();
        }
        int totalfingers=0;
        for(int i=0;i<s;i++){
            totalfingers = totalfingers+arr[i];
        }
       // System.out.println(totalfingers);
        int ways =0;
        
        for(int i=1;i<=5;i++){
            if((totalfingers+i)%(s+1)==0){
                ways++;
            }
        }
        System.out.println(ways);
       
    }
}
