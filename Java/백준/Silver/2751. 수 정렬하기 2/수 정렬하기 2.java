import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int input[] = new int[n];
        for(int i=0; i<n; i++){
            input[i] = Integer.parseInt(br.readLine());
        }

        input = Arrays.stream(input).sorted().toArray();
        for(int sorted:input){
            bw.write(sorted+"\n");
        }
        bw.close();
    }
}