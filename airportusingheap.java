import java.util.*;
public class airportusingheap {
    public static void main(String[] args){
        Scanner hariom =new Scanner(System.in);
        int n= hariom.nextInt();
        int m= hariom.nextInt();

        Integer seats[] = new Integer[m];
        for(int i=0;i<m;i++){
            seats[i]=hariom.nextInt();
        }
        PriorityQueue<Integer> maxHeap= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<m;i++){
            maxHeap.offer(seats[i]);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<m;i++){
            minHeap.offer(seats[i]);
        }
        int maximum=0;
        for(int i=0;i<n;i++){
            if(!maxHeap.isEmpty()){
                int maxseats=maxHeap.poll();
                if(maxseats>0){
                    maximum=maximum + maxseats;
                    maxHeap.offer(maxseats-1);
                }
            }
        }
        int minimum=0;
        for(int i=0;i<n;i++){
            if(!minHeap.isEmpty()){
                int minseats=minHeap.poll();
                if(minseats>0){
                    minimum=minimum+minseats;
                    minseats--;
                    if(minseats>0){
                        minHeap.offer(minseats);
                    }
                }
            }
        }
        System.out.println(maximum+" "+minimum);

    }
}
