import java.util.*;
public class potionseasyversion{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n=hariom.nextInt();
        int potion[] = new int[n];
        for(int i=0;i<n;i++){
            potion[i]=hariom.nextInt();
        }
        Arrays.sort(potion);
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum +potion[i];
        }int count=potion.length;
        if(sum>=0){
            System.out.println(count);
        }
        
        else{
            for(int i=0;i<potion.length;i++){
                if(sum<0){
                    sum=sum - potion[i];
                    count--;
                }
            }
            System.out.println(count);
        }

    }
}