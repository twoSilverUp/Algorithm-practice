import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer input = new StringTokenizer(br.readLine());
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(input.nextToken());
        }

        int maxLen[] = new int[n];
        for(int i=0; i<n; i++){
            maxLen[i]++;
            for(int j=0; j<i; j++){
                if(nums[j]<nums[i] && maxLen[j]+1 > maxLen[i]){
                    maxLen[i] = maxLen[j]+1;
                }
            }
        }
        bw.write(Arrays.stream(maxLen).max().getAsInt()+"");
        bw.close();
    }
}