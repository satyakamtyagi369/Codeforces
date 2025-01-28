import java.util.*;
public class dragons {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int s= hariom.nextInt();
        int n= hariom.nextInt();
        
        int dragons[][]= new int[n][2];
        for(int i=0;i<n;i++){
            dragons[i][0]=hariom.nextInt();
            dragons[i][1]=hariom.nextInt();
        }
        Arrays.sort(dragons, Comparator.comparingInt(a -> a[0]));
        boolean canwin=true;
        for(int i=0;i<n;i++){
            if(s>dragons[i][0]){
                s=s+dragons[i][1];
            }
            else{
                canwin=false;
                break;
            }
        } 
        if(canwin){
            System.out.println("YES");
        }       
        else{
            System.out.println("NO");
        }
    }
}
