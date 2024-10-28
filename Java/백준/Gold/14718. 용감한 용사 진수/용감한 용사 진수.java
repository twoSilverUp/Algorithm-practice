import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int power[] = new int[n];
        int speed[] = new int[n];
        int sortedIntel[][] = new int[n][3];
        for(int i=0; i<n; i++){
            input = br.readLine().split(" ");
            power[i] = sortedIntel[i][0] = Integer.parseInt(input[0]);
            speed[i] = sortedIntel[i][1] = Integer.parseInt(input[1]);
            sortedIntel[i][2] = Integer.parseInt(input[2]);
        }
        Arrays.sort(power);
        Arrays.sort(speed);
        Arrays.sort(sortedIntel, Comparator.comparing(o->o[2]));

        int result = Integer.MAX_VALUE;
        int now = 0;
        for(int p: power){
            for(int s: speed){
                int count = 0;
                int intel = Integer.MAX_VALUE;
                for(int i=0; i<n; i++){
                    if(sortedIntel[i][0] <= p && sortedIntel[i][1] <= s){
                        intel = sortedIntel[i][2];
                        count++;
                        if(count == k) break;
                    }
                }
                if(count == k){
                    if(result > p+s+intel) result = p+s+intel;
                }
            }
        }
        bw.write(result+"");
        bw.close();
    }
}