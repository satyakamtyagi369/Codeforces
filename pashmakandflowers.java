import java.util.*;
public class pashmakandflowers{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        long n= hariom.nextLong();
        long arr[]= new long[(int)n];
        for(int i=0;i<n;i++){
            arr[i]=hariom.nextInt();
        }
        Arrays.sort(arr);
        long maximum= arr[arr.length-1];
        long minimum= arr[0];
        long diff=maximum-minimum;
        long countmax=0;
        long countmin=0;
        for(int i=0;i<n;i++){
            if(arr[i]==minimum){
                countmin++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==maximum){
                countmax++;
            }
        }
        long pairs;
        if(diff==0){
            pairs=(n*(n-1))/2;
        }
        else{
            pairs= countmin*countmax;
        }
        
        System.out.println(diff+" "+pairs);

    }
}