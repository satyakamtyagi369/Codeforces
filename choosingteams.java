
import java.util.Scanner;

public class choosingteams {
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int k = hariom.nextInt();
        int eligiblecount=0;
        int particpatingcount[] = new int[n];
        for(int i=0;i<n;i++){
            particpatingcount[i]=hariom.nextInt();
            if(particpatingcount[i] + k <=5){
                eligiblecount++;
            }
        }
        int teams = eligiblecount /3;
        System.out.println(teams);
    }
}
