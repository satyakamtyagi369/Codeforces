import java.util.*;

public class countingrooms {
    public static void dfs(char arr[][], boolean[][] visited,int i, int j, int n,int m){
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i,j});
        while(!stack.isEmpty()){
            int[] current = stack.pop();
            i=current[0];
            j=current[1];
            if (i < 0 || j < 0 || i >= n || j >= m) continue;
            if (arr[i][j] == '#' || visited[i][j]) continue;
            visited[i][j] = true;
            stack.push(new int[]{i + 1, j}); // down
            stack.push(new int[]{i - 1, j}); // up
            stack.push(new int[]{i, j + 1}); // right
            stack.push(new int[]{i, j - 1}); // left
        }
    }
    public static void countingrooms(char[][] arr, int n, int m){
        boolean[][] visited = new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]=='.' && !visited[i][j]){
                    dfs(arr,visited,i,j,n,m);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
    Scanner hariom = new Scanner(System.in);
    int n=hariom.nextInt();
    int m=hariom.nextInt();
    hariom.nextLine();
    char[][] arr = new char[n][m];
    for(int i=0;i<n;i++){
        String row = hariom.nextLine();
        for(int j=0;j<m;j++){
            arr[i][j]=row.charAt(j);
        }
    }
    countingrooms(arr,n,m);
 }

}
