import java.util.Scanner;
public class petrandbook {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int pages=hariom.nextInt();
        int arr[]=new int[7];
        for(int i=0;i<7;i++){
            arr[i]= hariom.nextInt();
        }
        int sum=0;
        int index=0;
        while(sum<pages){
            sum = sum + arr[index];
            if(sum>=pages){
                break;
            }
            index=(index+1)%7;
        }
        
            System.out.println(index+1);
        

    }
}

