import java.io.*;
import java.util.*;

public class Main {
    static int x[] = {1, 0, -1, 0};
    static int y[] = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int map[][] = new int[n][n];
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split("");
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(input[j]);
            }
        }

        boolean visited[][] = new boolean[n][n];
        HashMap<Integer, Integer> houseNum = new HashMap<>();
        int key = 0;
        int val = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j] && map[i][j] == 1){
                    visited[i][j] = true;
                    Queue<Index> queue = new LinkedList<>();
                    queue.add(new Index(i, j));
                    while(!queue.isEmpty()){
                        Index now = queue.poll();
                        val++;
                        for(int p=0; p<4; p++){
                            if(now.x+x[p]<0 || now.x+x[p]>=n || now.y+y[p]<0 || now.y+y[p]>=n) continue;
                            if(!visited[now.x+x[p]][now.y+y[p]] && map[now.x+x[p]][now.y+y[p]] == 1){
                                visited[now.x+x[p]][now.y+y[p]] = true;
                                queue.add(new Index(now.x+x[p], now.y+y[p]));
                            }
                        }
                    }

                    houseNum.put(++key, val);
                    val = 0;
                }
            }
        }
        Object[] vals = houseNum.values().toArray();
        vals = Arrays.stream(vals).sorted().toArray();
        bw.write(vals.length+"\n");
        for(Object v: vals){
            bw.write(v+"\n");
        }
        bw.close();
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