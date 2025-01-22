
import java.util.*;

public class effectiveapproach {
   public static void main(String[] args){
    Scanner hariom = new Scanner(System.in);
    int n= hariom.nextInt();
    int a[]=new int[n];
    Map<Integer,Integer> positionmap = new HashMap<>();
    for(int i=0;i<n;i++){
        a[i]=hariom.nextInt();
        positionmap.put(a[i],i+1);
    }
    int m=hariom.nextInt();
    int b[]= new int[m];
    for(int i=0;i<m;i++){
        b[i]=hariom.nextInt();
    }
    long vasyaComparisons = 0;
        long petyaComparisons = 0;

        for (int i = 0; i < m; i++) {
            int index = positionmap.get(b[i]); 
            vasyaComparisons += index; 
            petyaComparisons += (n - index + 1); 
        }
        System.out.println(vasyaComparisons + " " + petyaComparisons);
   } 
}
