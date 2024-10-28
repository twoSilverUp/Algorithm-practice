import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] x = {-1, 0, 1, 0};
    static int[] y = {0, -1, 0, 1};
    static int[] z = {1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer input = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(input.nextToken());
        int n = Integer.parseInt(input.nextToken());
        int h = Integer.parseInt(input.nextToken());
        int tomato[][][] = new int[h][n][m];
        ArrayList<Index> already = new ArrayList<>();

        for(int i=0; i<h; i++){
            for(int j=0; j<n; j++){
                input = new StringTokenizer(br.readLine());
                for(int k=0; k<m; k++){
                    tomato[i][j][k] = Integer.parseInt(input.nextToken());
                    if(tomato[i][j][k] > 0){
                        already.add(new Index(j, k, i));
                    }
                }
            }
        }
        bfs(tomato, already, n, m, h);
        int max = 0;
        boolean hasZero = false;
        AA:
        for(int i=0; i<h; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<m; k++){
                    if(tomato[i][j][k] == 0){
                        hasZero = true;
                        break AA;
                    }
                    if(tomato[i][j][k] > max){
                        max = tomato[i][j][k];
                    }
                }
            }
        }
        if(hasZero) bw.write("-1");
        else bw.write(max-1+"");
        bw.close();
    }

    static void bfs(int[][][] map, ArrayList<Index> list, int n, int m, int h){
        boolean visited[][][] = new boolean[h][n][m];
        Queue<Index> queue = new LinkedList<>();
        queue.addAll(list);
        while(!queue.isEmpty()){
            Index now = queue.poll();
            visited[now.h][now.x][now.y] = true;
            for(int i=0; i<4; i++){
                if(x[i]+now.x<0 || x[i]+now.x==n || y[i]+now.y<0 || y[i]+now.y == m) continue;
                if(!visited[now.h][x[i]+now.x][y[i]+now.y] && map[now.h][x[i]+now.x][y[i]+now.y] == 0){
                    visited[now.h][x[i]+now.x][y[i]+now.y] = true;
                    queue.add(new Index(now.x + x[i], now.y+y[i], now.h));
                    map[now.h][x[i]+now.x][y[i]+now.y] = map[now.h][now.x][now.y]+1;
                }
            }
            for(int i=0; i<2; i++){
                if(z[i]+now.h<0 || z[i]+now.h==h) continue;
                if(!visited[now.h+z[i]][now.x][now.y] && map[now.h+z[i]][now.x][now.y] == 0){
                    visited[now.h+z[i]][now.x][now.y] = true;
                    queue.add(new Index(now.x, now.y, now.h+z[i]));
                    map[now.h+z[i]][now.x][now.y] = map[now.h][now.x][now.y]+1;
                }
            }
        }
    }

    static class Index{
        int x;
        int y;
        int h;
        Index(int x, int y, int h){
            this.x = x;
            this.y = y;
            this.h = h;
        }
    }
}