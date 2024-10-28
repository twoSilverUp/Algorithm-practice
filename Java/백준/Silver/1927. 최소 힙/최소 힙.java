import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                if(minHeap.size() == 0) bw.write(0+"\n");
                else{
                    bw.write(minHeap.poll()+"\n");
                }
            }
            else{
                minHeap.add(input);
            }
        }
        bw.close();
    }
}