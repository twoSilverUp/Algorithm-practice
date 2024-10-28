import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int map[][] = new int[n][n];

        for(int i=0; i<m; i++){
            input = br.readLine().split(" ");
            map[Integer.parseInt(input[0])-1][Integer.parseInt(input[1])-1] = 1;
            map[Integer.parseInt(input[1])-1][Integer.parseInt(input[0])-1] = 1;
        }

        int visited[] = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        int cc = 0;
        for(int i=0; i<n; i++){
            if(visited[i] == 1) continue;
            visited[i] = 1;
            queue.add(i);
            while(!queue.isEmpty()){
                int now = queue.poll();
                for(int j=0; j<n; j++){
                    if(visited[j]!=1 && map[now][j] == 1){
                        visited[j] = 1;
                        queue.add(j);
                    }
                }
            }
            cc++;
        }
        System.out.println(cc);
    }
}