import java.io.*;
import java.util.*;     //40%까지 채점 되다가 시간초과

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int min = (int)Math.ceil(m*9.0/10);

        boolean printed = false;

        String[] line = br.readLine().split(" ");
        Map<String, Integer> counts = new HashMap<>();

        for(int i=0; i<m; i++){
            counts.compute(line[i], (key, oldValue)->oldValue==null? 1: oldValue+1);
            if(counts.get(line[i])>=min){
                bw.write("YES");
                printed = true;
                break;
            }
        }

        if(!printed){
            for(int i=1; i<n-m+1; i++){
                counts.compute(line[i-1], (key, oldValue)->oldValue-1);
                counts.compute(line[i+m-1], (key, oldValue)-> oldValue==null? 1: oldValue+1);
                if(counts.get(line[i+m-1])>=min){
                    bw.write("YES");
                    printed = true;
                    break;
                }
            }
        }
        if(!printed) bw.write("NO");
        bw.close();
    }
}