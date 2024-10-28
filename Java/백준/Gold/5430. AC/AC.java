import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            char ac[] = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());
            String input[] = br.readLine().split("[,\\[\\]]");
            LinkedList<String> list = new LinkedList<>(Arrays.asList(input));

            if(n!=0){
                list.removeFirst();
            }

            int r=0;
            boolean error = false;
            for(char command: ac){
                if(command=='R') {
                    r++;
                }
                else if(list.isEmpty()){
                    bw.write("error");
                    error = true;
                    break;
                }
                else if(r%2==0) {
                    list.removeFirst();
                }
                else{
                    list.removeLast();
                }
            }

            if(!error){
                if(list.isEmpty()) bw.write("[");
                else if(r%2==1){
                    bw.write("["+list.removeLast());
                    while(!list.isEmpty()){
                        bw.write(","+list.removeLast());
                    }
                }
                else{
                    bw.write("["+list.removeFirst());
                    while(!list.isEmpty()){
                        bw.write(","+list.removeFirst());
                    }
                }
                bw.write("]");
            }
            bw.write("\n");
        }
        bw.close();
    }
}