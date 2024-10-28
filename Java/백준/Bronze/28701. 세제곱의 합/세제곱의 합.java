import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        int linear_sum = 0;
        int sum = 0;
        for(int i=1; i<input+1; i++){
            linear_sum+=i;
            sum+=i*i*i;
        }
        bw.write(linear_sum+"\n"+(int)Math.pow(linear_sum, 2)+"\n" + sum);
        bw.close();
    }
}