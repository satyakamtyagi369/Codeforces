import java.util.Scanner;
public class lightsout {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=hariom.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int a= arr[i][j];
                if(i-1>=0){
                    a = a+ arr[i-1][j];
                }
                if(i+1<3){
                    a= a + arr[i+1][j];
                }
                if(j-1>=0){
                    a=a + arr[i][j-1];
                }
                if(j+1<3){
                    a= a+ arr[i][j+1];
                }
                if(a%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
