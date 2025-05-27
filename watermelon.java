import java.util.*;
public class watermelon{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int w= hariom.nextInt();
        if(w>2&&w%2==0){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}