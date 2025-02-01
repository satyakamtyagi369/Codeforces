
import java.util.*;

public class pigeonholenest {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n = hariom.nextInt();
        int q = hariom.nextInt();

        int pigeontonest[]=new int[n+1];
        HashMap <Integer,Integer> nestcount= new HashMap<>();
        for(int i=1;i<=n;i++){
            pigeontonest[i]=i;
            nestcount.put(i,1);
        }
        int overcrowdednests=0;
        for(int i=0;i<q;i++){
            int type=hariom.nextInt();
            if(type==1){
                int p=hariom.nextInt();
                int h=hariom.nextInt();
                int oldnest = pigeontonest[p];

                nestcount.put(oldnest,nestcount.get(oldnest)-1);
                if(nestcount.get(oldnest)==1){
                    overcrowdednests--;
                }
                nestcount.put(h,nestcount.getOrDefault(h, 0)+1);
                if(nestcount.get(h)==2){
                    overcrowdednests++;
                }
                pigeontonest[p]=h;
            }
            else{
                System.out.println(overcrowdednests);
            }
        }
    }
}
