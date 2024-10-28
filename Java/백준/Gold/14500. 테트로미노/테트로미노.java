import java.io.*;
import java.util.StringTokenizer;

public class Main {
    //가로 길쭉이
    static int x1[] = {0, 0, 0, 0};
    static int y1[] = {0, 1, 2, 3};
    //L
    static int x2[] = {0, 1, 2, 2};
    static int y2[] = {0, 0, 0, 1};
    //꺾인 거
    static int x3[] = {0, 1, 1, 2};
    static int y3[] = {0, 0, 1, 1};
    //ㅜ
    static int x4[] = {0, 0, 1, 0};
    static int y4[] = {0, 1, 1, 2};
    //ㅁ
    static int x5[] = {0, 0, 1, 1};
    static int y5[] = {0, 1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int map[][] = new int[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                max = Math.max(max, findMax(map, i, j, n, m));
            }
        }
        bw.write(max+"");
        bw.close();
    }

    static int findMax(int[][] map, int x, int y, int n, int m){
        int max = 0;
        int now = 0;
        //가로 길쭉이
        for(int i=0; i<4; i++){
            if(x+x1[i]==n || y+y1[i] == m) break;
            now += map[x+x1[i]][y+y1[i]];
        }
        if(now > max) max = now;

        //세로 길쭉이
        now = 0;
        for(int i=0; i<4; i++){
            if(x+y1[i]==n || y+x1[i] == m) break;
            now += map[x+y1[i]][y+x1[i]];
        }
        if(now > max) max = now;

        /*--- 2 ---*/
        now = 0;
        for(int i=0; i<4; i++){
            if(x+x2[i]==n || y+y2[i] == m) break;
            now += map[x+x2[i]][y+y2[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x-x2[i]<0 || x-x2[i]==n || y+y2[i] == m) break;
            now += map[x-x2[i]][y+y2[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x+x2[i]==n || y-y2[i] == m || y-y2[i] < 0) break;
            now += map[x+x2[i]][y-y2[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x-x2[i]<0 || y-y2[i]<0 ||x-x2[i]==n || y-y2[i] == m) break;
            now += map[x-x2[i]][y-y2[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x+y2[i]==n || y+x2[i] == m) break;
            now += map[x+y2[i]][y+x2[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x-y2[i]<0 ||x-y2[i]==n || y+x2[i] == m) break;
            now += map[x-y2[i]][y+x2[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x+y2[i]==n || y-x2[i] == m || y-x2[i]<0) break;
            now += map[x+y2[i]][y-x2[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x-y2[i]<0 || y-x2[i]<0 || x-y2[i]==n || y-x2[i] == m) break;
            now += map[x-y2[i]][y-x2[i]];
        }
        if(now > max) max = now;

        /* --- 3 --- */
        now = 0;
        for(int i=0; i<4; i++){
            if(x+x3[i]==n || y+y3[i] == m) break;
            now += map[x+x3[i]][y+y3[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x-x3[i]<0 || x-x3[i]==n || y+y3[i] == m) break;
            now += map[x-x3[i]][y+y3[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x+x3[i]==n || y-y3[i] == m || y-y3[i]<0) break;
            now += map[x+x3[i]][y-y3[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x-x3[i]<0 || y-y3[i]<0 || x-x3[i]==n || y-y3[i] == m) break;
            now += map[x-x3[i]][y-y3[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x+y3[i]==n || y+x3[i] == m) break;
            now += map[x+y3[i]][y+x3[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x-y3[i]<0 || x-y3[i]==n || y+x3[i] == m) break;
            now += map[x-y3[i]][y+x3[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x-y3[i]<0 || x-y3[i]==n || y-x3[i] == m || y-x3[i]<0) break;
            now += map[x-y3[i]][y-x3[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x+y3[i]==n || y-x3[i] == m || y-x3[i]<0) break;
            now += map[x+y3[i]][y-x3[i]];
        }
        if(now > max) max = now;

        /* --- 4 --- */
        now = 0;
        for(int i=0; i<4; i++){
            if(x+x4[i]==n || y+y4[i] == m) break;
            now += map[x+x4[i]][y+y4[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x-x4[i]<0 || x-x4[i]==n || y+y4[i] == m) break;
            now += map[x-x4[i]][y+y4[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x+x4[i]==n || y-y4[i] == m || y-y4[i]<0) break;
            now += map[x+x4[i]][y-y4[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x-x4[i]<0 || y-y4[i]<0 || x-x4[i]==n || y-y4[i] == m) break;
            now += map[x-x4[i]][y-y4[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x+y4[i]==n || y+x4[i] == m) break;
            now += map[x+y4[i]][y+x4[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x-y4[i]<0 || x-y4[i]==n || y+x4[i] == m) break;
            now += map[x-y4[i]][y+x4[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x+y4[i]==n || y-x4[i] == m || y-x4[i]<0) break;
            now += map[x+y4[i]][y-x4[i]];
        }
        if(now > max) max = now;

        now = 0;
        for(int i=0; i<4; i++){
            if(x-y4[i]<0 || y-x4[i]<0|| x-y4[i]==n || y-x4[i] == m) break;
            now += map[x-y4[i]][y-x4[i]];
        }
        if(now > max) max = now;

        //ㅁ
        now = 0;
        for(int i=0; i<4; i++){
            if(x+x5[i]==n || y+y5[i] == m) break;
            now += map[x+x5[i]][y+y5[i]];
        }
        if(now > max) max = now;

        return max;
    }
}