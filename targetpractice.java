import java.util.*;
public class targetpractice {
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int t= hariom.nextInt();
        while(t-->0){
            char arr[][]=new char[10][10];
            for(int i=0;i<10;i++){
                String line = hariom.next();
                for(int j=0;j<10;j++){
                    arr[i][j]=line .charAt(j);
                }
            }
            int sum =0;
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(i==0 || j==0 ||i==9 || j==9){
                        if(arr[i][j]=='X'){
                            sum = sum + 1;
                        }
                    }
                    else if(i==1 || j==1 ||i==8 || j==8){
                        if(arr[i][j]=='X'){
                            sum = sum + 2;
                        }
                    }
                    else if(i==2 || j==2 ||i==7 || j==7){
                        if(arr[i][j]=='X'){
                            sum = sum + 3;
                        }
                    }
                    else if(i==3 || j==3 ||i==6 || j==6){
                        if(arr[i][j]=='X'){
                            sum = sum + 4;
                        }
                    }
                    else if(i==4 || j==4 ||i==5 || j==5){
                        if(arr[i][j]=='X'){
                            sum = sum + 5;
                        }
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
