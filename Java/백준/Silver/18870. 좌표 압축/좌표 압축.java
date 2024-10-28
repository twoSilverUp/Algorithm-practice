import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Pair> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            list.add(new Pair(i, Integer.parseInt(st.nextToken())));
        }

        list.sort(Comparator.comparing(pair -> pair.value));
        int before = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0; i<n; i++){
            if(before == list.get(i).value){
                list.set(i, new Pair(list.get(i).index, --index));
            }
            else{
                before = list.get(i).value;
                list.set(i, new Pair(list.get(i).index, index));
            }
            index++;
        }
        list.sort(Comparator.comparing(pair->pair.index));
        for(Pair p: list){
            bw.write(p.value+" ");
        }
        bw.close();
    }

    static class Pair{
        int index;
        int value;
        Pair(int i, int v){
            index = i;
            value = v;
        }
    }
}