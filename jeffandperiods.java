
import java.util.*;

public class jeffandperiods {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=hariom.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        System.out.println(set.size());
        List<Integer> list = new ArrayList<>(set);
        int diff=0;
        int a=0;
        boolean processed[]=new boolean[list.size()];
        for(int i=0;i<arr.length-1;i++){
            if(list.get(a)==arr[i+1]){
                diff=i+1-a;
                System.out.println(list.get(a)+" "+diff);
                processed[a]=true;
                a++;
                if(a>=list.size()){
                    break;
                }
            }
        }
        for(int i=0;i<list.size();i++){
            if(!processed[i]){
                System.out.println(list.get(i)+" "+0);
            }
        }
    }
}
