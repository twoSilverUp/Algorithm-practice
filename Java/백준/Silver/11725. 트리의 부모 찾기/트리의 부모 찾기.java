import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, ArrayList<Integer>> edges = new HashMap<>();
        for(int i=0; i<n-1; i++){
            StringTokenizer input = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(input.nextToken());
            int node2 = Integer.parseInt(input.nextToken());
            edges.putIfAbsent(node1, new ArrayList<>());
            edges.putIfAbsent(node2, new ArrayList<>());
            edges.get(node1).add(node2);
            edges.get(node2).add(node1);
        }

        int parent[] = new int[n+1];
        dfs(edges, parent, n);
        for(int i=2; i<n+1; i++){
            bw.write(parent[i]+"\n");
        }
        bw.close();
    }

    static void dfs(HashMap<Integer, ArrayList<Integer>> edge, int[] parent, int n) throws IOException {
        int visited[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        visited[0] = 1;
        while(!stack.isEmpty()){
            int now = stack.pop();
            for(int compare: edge.get(now)){
                if(visited[compare-1] != 1){
                    parent[compare] = now;
                    visited[compare-1] = 1;
                    stack.add(compare);
                }
            }
        }
    }
}