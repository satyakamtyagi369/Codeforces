import java.util.*;
public class bfsexample{
    public static void main(String[] args){
        Scanner hariom = new Scanner(System.in);
        int vertices=6;
        List<List<Integer>> graph= new ArrayList<>();
        for(int i=0;i<vertices;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(5);
        bfs(0,graph);
    }
    public static void bfs(int start, List<List<Integer>> graph){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];
        queue.add(start);
        visited[start]=true;
        while(!queue.isEmpty()){
            int current= queue.poll();
            System.out.print(current+" ");
            List<Integer> neighbors= graph.get(current);
            for(int i=0;i<neighbors.size();i++){
                int neighbor = neighbors.get(i);
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    queue.offer(neighbor);
                }
            }
        }
    }
}