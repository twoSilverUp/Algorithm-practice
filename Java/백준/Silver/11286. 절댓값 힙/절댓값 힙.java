import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pQ = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int absCompare = Integer.compare(Math.abs(o1), Math.abs(o2));
                if(absCompare == 0) return Integer.compare(o1, o2);
                else return absCompare;
            }
        });

        for(int i=0; i<n; i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                if(pQ.isEmpty()){
                    bw.write("0\n");
                }
                else bw.write(pQ.poll()+"\n");
            }
            else pQ.add(input);
        }
        bw.close();
    }
}