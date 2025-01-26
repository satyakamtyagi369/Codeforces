import java.util.Scanner;
public class bicyclechain{
    public static void main(String[] args){
    Scanner hariom = new Scanner(System.in);
    int n= hariom.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=hariom.nextInt();
    }
    int m= hariom.nextInt();
    int b[]=new int[m];
    for(int i=0;i<m;i++){
        b[i]=hariom.nextInt();
    }
    int maxratio=0;
    int countmaxratio=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(b[j]%a[i]==0){
                int ratio= b[j]/a[i];
                if(ratio>maxratio){
                    maxratio=ratio;
                    countmaxratio=1;
                }
                else if(ratio==maxratio){
                    countmaxratio++;
                }
            }
        }
    }
    System.out.println(countmaxratio);
    }
}