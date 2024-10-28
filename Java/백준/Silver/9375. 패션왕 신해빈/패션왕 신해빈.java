import java.io.*;
import java.util.Collection;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            HashMap<String, Integer> clothes = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for(int j=0; j<n; j++){
                String input[] = br.readLine().split(" ");
                clothes.compute(input[1], (key,value) -> (value==null)? 1: value+1);
            }

            Collection<Integer> vals = clothes.values();
            int numCase = 1;
            for(int val : vals){
                numCase *= (val+1);
            }
            bw.write(numCase-1+"\n");
        }
        bw.close();
    }
}