
import java.util.Scanner;

public class beautifulyear {
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int nextdistinctdigit = finddistinctdigit(n);
        System.out.println(nextdistinctdigit);
    }
    public static int finddistinctdigit(int year){
        while (true) { 
            year++;
            if(hasdistinctdigityear(year)){
                return year;
            }
        }
    }
    public static boolean hasdistinctdigityear(int year){
        int freq[] = new int[10];
        while(year>0){
            int digit = year%10;
            freq[digit]++;
            if(freq[digit]>1){
                return false;
            }
            year=year/10;
        }
        return true;
    }
}
