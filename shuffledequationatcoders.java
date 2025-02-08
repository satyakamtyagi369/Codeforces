import java.util.*;
public class shuffledequationatcoders{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int a= hariom.nextInt();
        int b= hariom.nextInt();
        int c= hariom.nextInt();
        if(a*b==c){
            System.out.println("YES");
        }
        else if(a*c==b){
            System.out.println("YES");
        }
        else if(b*c==a){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}