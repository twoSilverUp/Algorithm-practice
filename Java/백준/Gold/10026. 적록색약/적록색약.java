import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[] dx = {1, 0 , -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char rgb[][] = new char[n][n];
        for(int i=0; i<n; i++){
            rgb[i] = br.readLine().toCharArray();
        }
        int visited1[][] = new int[n][n];
        int visited2[][] = new int[n][n];

        int num1 = 0;
        int num2 = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(visited1[i][j] != 1) {
                    bfs1(rgb, visited1, i, j, n);
                    num1++;
                }
                if(visited2[i][j] != 1){
                    bfs2(rgb, visited2, i, j, n);
                    num2++;
                }
            }
        }
        System.out.println(num1 + " " + num2);
    }

    public static void bfs1(char[][] map, int[][] visited, int x, int y, int n){
        Queue<Index> queue = new LinkedList<>();
        queue.add(new Index(x, y));
        visited[x][y] = 1;
        while(!queue.isEmpty()){
            Index i = queue.poll();
            for(int j=0; j<4; j++){
                if(dx[j]+i.x>=n || dx[j]+i.x<0 || dy[j]+i.y>=n || dy[j]+i.y<0) continue;
                if(visited[dx[j]+i.x][dy[j]+i.y] != 1 && map[x][y] == map[dx[j]+i.x][dy[j]+i.y]){
                    visited[dx[j]+i.x][dy[j]+i.y] = 1;
                    queue.add(new Index(dx[j]+i.x, dy[j]+i.y));
                }
            }
        }
    }

    public static void bfs2(char[][] map, int[][] visited, int x, int y, int n){
        Queue<Index> queue = new LinkedList<>();
        queue.add(new Index(x, y));
        visited[x][y] = 1;
        while(!queue.isEmpty()){
            Index i = queue.poll();
            for(int j=0; j<4; j++){
                if(dx[j]+i.x>=n || dx[j]+i.x<0 || dy[j]+i.y>=n || dy[j]+i.y<0) continue;
                if(visited[dx[j]+i.x][dy[j]+i.y] != 1 && map[x][y] == map[dx[j]+i.x][dy[j]+i.y]){
                    visited[dx[j]+i.x][dy[j]+i.y] = 1;
                    queue.add(new Index(dx[j]+i.x, dy[j]+i.y));
                }
                else if((map[x][y] == 'R' || map[x][y] == 'G') && visited[dx[j]+i.x][dy[j]+i.y] != 1 && (map[dx[j]+i.x][dy[j]+i.y] == 'R' || map[dx[j]+i.x][dy[j]+i.y] == 'G')){
                    visited[dx[j]+i.x][dy[j]+i.y] = 1;
                    queue.add(new Index(dx[j]+i.x, dy[j]+i.y));
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