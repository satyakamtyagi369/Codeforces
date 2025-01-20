import java.util.Scanner;
public class arrivalofthegeneral {
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=hariom.nextInt();
        }
        int maxele=arr[0];
        int minele=arr[0];
        for(int i=0;i<n;i++){
            if(maxele<arr[i]){
                maxele=Math.max(maxele,arr[i]);
            }
            if(minele>arr[i]){
                minele=Math.min(minele,arr[i]);

            }
        }
        int maxi=0;
        for(int i=0;i<n;i++){
            if(maxele==arr[i]){
                maxi=i;
                break;
            }
        }
        int mini=0;
        for(int i=0;i<n;i++){
            if(minele==arr[i]){
                mini=i;
                
            }
        }
       if(maxi>mini){
        System.out.println((maxi-0)+(n-1-mini)-1);
       }
       else{
        System.out.println((maxi-0)+(n-1-mini));
       }
        
       
    }
}
