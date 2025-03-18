import java.util.*;
public class potioneasy{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int n=hariom.nextInt();
        int potion[] = new int[n];
        for(int i=0;i<n;i++){
            potion[i]=hariom.nextInt();
        }
       PriorityQueue<Integer> minheap= new PriorityQueue<>();
       long health=0;
       int count=0;
       for(int i=0;i<n;i++){
        health = health+ potion[i];
        minheap.add(potion[i]);
        count++;
        if(health<0){
            health=health-minheap.poll();
            count--;
        }
       }
       System.out.println(count);
    }
}