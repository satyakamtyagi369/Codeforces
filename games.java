import java.util.*;
public class games{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int host[] = new int[n];
        int guest[] = new int[n];
        for(int i=0;i<n;i++){
            host[i]=hariom.nextInt();
            guest[i]=hariom.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && host[i]==guest[j]){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}