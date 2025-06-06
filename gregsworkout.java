import java.util.*;
public class gregsworkout{
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = hariom.nextInt();
        }
        int chest=0;
        int biceps=0;
        int back=0;
        for(int i=0;i<n;i++){
            if(i%3==0){
                chest = chest + arr[i];
            }
            else if(i%3==1){
                biceps = biceps + arr[i];
            }
            else{
                back = back + arr[i];
            }
        }
      int max = Math.max(chest,Math.max(biceps, back));
      if(max==chest){
          System.out.println("chest");
      }
      else if(max==biceps){
          System.out.println("biceps");
      }
      else{
          System.out.println("back");
      }
    }
}