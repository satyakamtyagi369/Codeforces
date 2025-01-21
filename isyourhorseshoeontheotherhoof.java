import java.util.HashSet;
import java.util.Scanner;
public class isyourhorseshoeontheotherhoof{
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int arr[]= new int[4];
        for(int i=0;i<4;i++){
            arr[i]= hariom.nextInt();
        }
        HashSet set = new HashSet<>();
        for(int i=0;i<4;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        System.out.println(4-set.size());
    }
}