import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[] dx = new int[] {-1, 0, 1, 0};
    static int[] dy = new int[] {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char puyo[][] = new char[12][6];
        boolean[][] visited = new boolean[12][6];

        for(int i=0; i<12; i++){
            puyo[i] = br.readLine().toCharArray();
        }
        int n = 0;

        while(true){
            boolean done = false;
            for(int x=0; x<12; x++){
                for(int y=0; y<6; y++){
                    if(bfs(x, y, puyo, visited)){
                        done = true;
                    }
                }
            }
            if(!done) break;

            n++;
            char newPuyo[][] = new char[12][6];
            for(int y=0; y<6; y++) {
                int now = 11;
                boolean check = false;
                for (int x = 11; x > -1; x--) {
                    if(puyo[x][y] != '.'){
                        newPuyo[now--][y] = puyo[x][y];
                    }
                }
                for(int i=0; i<=now; i++){
                    newPuyo[i][y] = '.';
                }
            }
            puyo = newPuyo;
            visited = new boolean[12][6];
        }
        System.out.println(n);
    }

    public static boolean bfs(int x, int y, char[][] graph, boolean[][] visited){
        Queue<Index> q = new LinkedList<Index>();

        visited[x][y] = true;
        q.offer(new Index(x,y));

        ArrayList<Index> visitList = new ArrayList<Index>();
        while(!q.isEmpty()){
            Index p = q.poll();
            visitList.add(p);
            if(graph[p.row][p.col] == '.') break;
            for(int i=0; i<4; i++){
                if(p.row + dx[i] < 0 || p.row + dx[i] > 11 || p.col + dy[i] < 0 || p.col + dy[i] > 5) continue;
                if(graph[x][y] == graph[p.row+dx[i]][p.col+dy[i]] && !visited[p.row+dx[i]][p.col+dy[i]]){
                    visited[p.row+dx[i]][p.col+dy[i]] = true;
                    q.offer(new Index(p.row + dx[i], p.col + dy[i]));
                }
            }
        }

        if(visitList.size() > 3){
            for(Index index: visitList){
                graph[index.row][index.col] = '.';
            }
            return true;
        }
        return false;
    }

    public static class Index{
        int row;
        int col;
        Index(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
}