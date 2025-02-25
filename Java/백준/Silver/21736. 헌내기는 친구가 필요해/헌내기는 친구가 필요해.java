import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        char map[][] = new char[n][m];

        int x=-1, y=-1;
        for(int i=0; i<n; i++){
            map[i] = br.readLine().toCharArray();
            for(int j=0; j<m; j++){
                if(map[i][j]=='I'){
                    x=i;
                    y=j;
                }
            }
        }

        int meet = 0;
        LinkedList<Index> queue = new LinkedList<>();
        queue.addLast(new Index(x, y));
        int[] toGoX = {-1,1,0,0};
        int[] toGoY = {0,0,1,-1};
        while(!queue.isEmpty()){
            Index now = queue.pop();
            for(int i=0; i<4;i++){
                if(now.x+toGoX[i]==n||now.x+toGoX[i]==-1||now.y+toGoY[i]==m||now.y+toGoY[i]==-1)
                    continue;
                if(map[now.x+toGoX[i]][now.y+toGoY[i]]!='I' && map[now.x+toGoX[i]][now.y+toGoY[i]]!='X'){
                    if(map[now.x+toGoX[i]][now.y+toGoY[i]]=='P')
                        meet++;
                    map[now.x+toGoX[i]][now.y+toGoY[i]]='I';
                    queue.addLast(new Index(now.x+toGoX[i],now.y+toGoY[i]));
                }
            }
        }
        if(meet==0)
            System.out.println("TT");
        else
            System.out.println(meet);
    }

    static class Index{
        int x;
        int y;

        Index(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
}