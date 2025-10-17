/* 
import java.util.*;
class secondlargest{
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = hariom.nextInt();
        }
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=maxi){
                list.add(arr[i]);
            }
        }
        int newmaxi=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>newmaxi){
                newmaxi=list.get(i);
            }
        }
        System.out.print(newmaxi);
        
    }
}*/
import java.util.*;
class secondlargest{
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = hariom.nextInt();
        }
        int firstmaxi = Integer.MIN_VALUE;
        int secondmaxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>firstmaxi){
                secondmaxi = firstmaxi;
                firstmaxi = arr[i];
            }
            else if(arr[i]>secondmaxi && arr[i]!=firstmaxi){
                secondmaxi = arr[i];
            }
        }
        System.out.print(secondmaxi);
    }
}