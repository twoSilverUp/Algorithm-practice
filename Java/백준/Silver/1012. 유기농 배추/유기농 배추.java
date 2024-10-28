import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int x[] = {1, 0, -1, 0};
        int y[] = {0, 1, 0, -1};

        for(int i=0; i<t; i++){
            String[] input = br.readLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int n = Integer.parseInt(input[1]);
            int k = Integer.parseInt(input[2]);
            int isIn[][] = new int[n][m];

            for(int j=0; j<k; j++){
                input = br.readLine().split(" ");
                isIn[Integer.parseInt(input[1])][Integer.parseInt(input[0])] = 1;
            }

            int visited[][] = new int[n][m];
            int worm = 0;
            LinkedList<Index> queue = new LinkedList<>();
            for(int p=0; p<n; p++){
                for(int q=0; q<m; q++){
                    if(isIn[p][q] != 1 || visited[p][q] == 1) continue;

                    visited[p][q] = 1;
                    queue.add(new Index(p, q));
                    while(!queue.isEmpty()){
                        Index now = queue.removeFirst();
                        for(int ii=0; ii<4; ii++){
                            if(now.x+x[ii]<0 || now.x+x[ii]>=n || now.y+y[ii]<0 || now.y+y[ii]>=m) continue;
                            if(visited[now.x+x[ii]][now.y+y[ii]] != 1 && isIn[now.x+x[ii]][now.y+y[ii]] == 1) {
                                visited[now.x+x[ii]][now.y+y[ii]] = 1;
                                queue.add(new Index(now.x+x[ii], now.y+y[ii]));
                            }
                        }
                    }
                    worm++;
                }
            }
            System.out.println(worm);
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