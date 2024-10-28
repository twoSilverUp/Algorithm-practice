import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int rgb[][] = new int[n][3];
        rgb[0] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i=1; i<n; i++){
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            rgb[i][0] = input[0] + Math.min(rgb[i-1][1], rgb[i-1][2]);
            rgb[i][1] = input[1] + Math.min(rgb[i-1][0], rgb[i-1][2]);
            rgb[i][2] = input[2] + Math.min(rgb[i-1][1], rgb[i-1][0]);
        }
        System.out.println(Math.min(rgb[n-1][0], Math.min(rgb[n-1][1], rgb[n-1][2])));
    }
}