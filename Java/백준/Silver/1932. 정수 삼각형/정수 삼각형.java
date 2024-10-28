import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int triangle[][] = new int[n][];

        for(int i=0; i<n; i++){
            triangle[i] = new int[i+1];
            triangle[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<i+1; j++){
                if(j==0)
                    triangle[i][j] += triangle[i-1][0];
                else if (j==i)
                    triangle[i][j] += triangle[i-1][i-1];
                else
                    triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);
            }
        }

        bw.write(Arrays.stream(triangle[n-1]).max().orElseThrow()+"");
        bw.close();
    }
}