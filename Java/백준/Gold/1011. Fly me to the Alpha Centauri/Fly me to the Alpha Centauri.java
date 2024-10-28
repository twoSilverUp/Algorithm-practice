import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            String input[] = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            int diff = y-x;

            if(Math.pow(Math.round(Math.sqrt(diff)), 2) == diff){
                bw.write((int)Math.sqrt(diff)*2-1 + "\n");
            }
            else if((int)Math.round(Math.sqrt(diff)) == (int) Math.sqrt(diff)){
                bw.write((int)Math.sqrt(diff)*2 + "\n");
            }
            else bw.write((int)Math.sqrt(diff) * 2 +1+ "\n");
        }
        bw.close();
    }
}