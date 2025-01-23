
import java.util.*;

public class dimaandfriends {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int s= hariom.nextInt();
        int arr[]= new int[s];
        for(int i=0;i<s;i++){
            arr[i]= hariom.nextInt();
        }
        int sumfriends=0;
       for(int i=0;i<s;i++){
        sumfriends=sumfriends+arr[i];
       }
       int validways=0;
       for(int dimafingers=1;dimafingers<=5;dimafingers++){
        int totalfingers=sumfriends + dimafingers;
        int position = (totalfingers-1)%(s+1);
        if(position!=0){
            validways++;
        }
       }
       System.out.println(validways);
    }
}
