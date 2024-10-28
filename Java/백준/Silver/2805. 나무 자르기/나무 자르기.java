import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int trees[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(trees);
        int max = trees[input[0]-1] -1;

        while(true){
            int sum=0;
            for(int i=input[0]-1; i>=0; i--){
                if(trees[i] > max){
                    sum+= trees[i]-max;
                }
                else break;
            }
            if(sum>=input[1]) break;
            max--;
        }
        System.out.println(max);
    }
}