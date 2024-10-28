import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        int map[][] = new int[n+1][n+1];

        for(int i=0; i<e; i++){
            String input[] = br.readLine().split(" ");
            map[Integer.parseInt(input[0])][Integer.parseInt(input[1])] = 1;
            map[Integer.parseInt(input[1])][Integer.parseInt(input[0])] = 1;
        }

        int visited[] = new int[n+1];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[1] = 1;
        queue.add(1);
        int num = 0;
        while(!queue.isEmpty()){
            int node = queue.removeFirst();
            for(int i=1; i<n+1; i++){
                if(visited[i] != 1 && map[node][i] == 1){
                    queue.add(i);
                    visited[i] = 1;
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}