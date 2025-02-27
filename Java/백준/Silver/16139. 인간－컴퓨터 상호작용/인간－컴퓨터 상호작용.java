import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] input = br.readLine().toCharArray();
        int[][] counts = new int[28][input.length];

        counts[input[0]-'a'][0] = 1;
        for(int i=1; i<input.length; i++){
            for(int j=0; j<28; j++){
                if(input[i]-'a'==j) counts[j][i]=counts[j][i-1]+1;
                else counts[j][i]=counts[j][i-1];
            }
        }

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String[] task = br.readLine().split(" ");
            char alpha = task[0].charAt(0);
            int start = Integer.parseInt(task[1]);
            int end = Integer.parseInt(task[2]);

            int result = start==0? counts[alpha-'a'][end] : counts[alpha-'a'][end]-counts[alpha-'a'][start-1];
            bw.write(result+"\n");
        }
        bw.close();
    }
}