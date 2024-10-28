import java.io.*;
import java.util.*;

public class Main {
    static int x[] = {0, 1, 0, -1};
    static int y[] = {1, 0, -1, 0};
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int tomato[][] = new int[n][m];
        ArrayList<Index> already = new ArrayList<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                tomato[i][j] = Integer.parseInt(st.nextToken());
                if(tomato[i][j] > 0){
                    already.add(new Index(i, j));
                }
            }
        }

        bfs(tomato, already, n, m);
        int max = 0;
        boolean stop = false;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(tomato[i][j] == 0){
                    bw.write("-1");
                    stop = true;
                    break;
                }
                if(max<tomato[i][j]) max=tomato[i][j];
            }
            if(stop) break;
        }
        if(!stop) bw.write(max-1+"");
        bw.close();
    }

    public static void bfs(int[][] map, ArrayList<Index> already, int n, int m){
        int[][] visited = new int[n][m];
        Queue<Index> queue = new LinkedList<>();
        queue.addAll(already);
        for(Index i: already){
            visited[i.x][i.y] = 1;
        }
        while(!queue.isEmpty()){
            Index now = queue.poll();
            for(int i=0; i<4; i++){
                if(now.x+x[i]>=n || now.x+x[i]<0 || now.y+y[i]>=m || now.y+y[i]<0) continue;
                if(map[now.x+x[i]][now.y+y[i]] != -1 && visited[now.x+x[i]][now.y+y[i]] != 1){
                    queue.add(new Index(now.x+x[i],now.y+y[i]));
                    visited[now.x+x[i]][now.y+y[i]] = 1;
                    map[now.x+x[i]][now.y+y[i]] = 1 + map[now.x][now.y];
                }
            }
        }
    }

    static class Index{
        int x;
        int y;
        Index(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}