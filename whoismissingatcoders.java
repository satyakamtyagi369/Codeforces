
import java.util.*;

public class whoismissingatcoders {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int s= hariom.nextInt();
        int arr[]= new int[s];
        for(int i=0;i<s;i++){
            arr[i]=hariom.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(i+1);
        }
        for(int i=0;i<s;i++){
            set.remove(arr[i]);
        }
        System.out.println(set.size());
        List<Integer> list = new ArrayList<>(set);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
