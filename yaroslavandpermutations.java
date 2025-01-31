/*import java.util.*;
public class yaroslavandpermutations {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n=hariom.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=hariom.nextInt();
        }
        if(n==1){
            System.out.println("YES");
            return;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                int temp=arr[i+1];
                arr[i+1]=arr[i+2];
                arr[i+2]=temp;
                if(arr[i]==arr[i+1]){
                    System.out.println("NO");
                    break;
                }
                else{
                    System.out.println("YES");
                }
            }
            else{
              
                if(set.size()==arr.length){
                    System.out.println("YES");
                    return;
                }
                
            }
            
        }
    }
}*/
import java.util.*;
public class yaroslavandpermutations {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = hariom.nextInt();
        }
        if (n == 1) {
            System.out.println("YES");
            return;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int maxFrequency = Collections.max(map.values());
        if (maxFrequency > (n + 1) / 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}

