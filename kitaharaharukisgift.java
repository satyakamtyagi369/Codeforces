import java.util.*;
public class kitaharaharukisgift{
  
        public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=hariom.nextInt();
        }
        int count100=0;
        int count200=0;
        for(int i=0;i<n;i++){
            if(arr[i]==100){
                count100++;
            }
            if(arr[i]==200){
                count200++;
            }
        }
        int totalweight=count100*100 + count200*200;
        if(totalweight%200!=0){
            System.out.println("NO");
            return;
        }
        int halfweight=totalweight/2;
        while(halfweight>=200&&count200>0){
            halfweight=halfweight-200;
            count200--;
        }
        while(halfweight>=100&&count100>0){
            halfweight=halfweight-100;
            count100--;
        }
        if(halfweight==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
    }    
