import java.util.*;
public class labyrinth {
    public static void labyrin(char[][] arr,int n, int m){
        
    }
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n=hariom.nextInt();
        int m=hariom.nextInt();
        hariom.nextLine();
        char[][] arr = new char[n][m];
        for(int i=0;i<n;i++){
            String row= hariom.nextLine();
            for(int j=0;j<m;j++){
                arr[i][j]=row.charAt(j);
            }
        }
        labyrin(arr,n,m);
    }
}