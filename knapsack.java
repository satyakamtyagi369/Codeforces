import java.util.*;
public class knapsack{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t-->0){
            int n=hariom.nextInt();
            int w= hariom.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=hariom.nextInt();
            }
            int dp[][]= new int[n+1][w+1];
            for(int i=0;i<=n;i++){
                dp[i][0]=0;
            }
            for(int j=0;j<=w;j++){
                dp[0][j]=0;
            }
            for(int i=1;i<=n;i++){
                int itemval=arr[i-1];
                int itemwt=arr[i-1];
                for(int j=1;j<=w;j++){
                    if(itemwt<=j){
                        dp[i][j]=Math.max(itemval+ dp[i-1][j-itemwt],dp[i-1][j]);
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
            System.out.println(dp[n][w]);
        }
    }
}
