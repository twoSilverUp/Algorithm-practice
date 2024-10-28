import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Map<Character, Integer> isUsed = IntStream.rangeClosed('A', 'Z').boxed().collect(Collectors.toMap(i -> (char) i.intValue(), i -> 0));
        String checked[] = new String[n];

        for(int i=0; i<n; i++){
            String input = br.readLine();
            String word[] = input.split(" ");
            boolean done = false;
            String result = "";

            for(String w: word){
                if(!done && isUsed.get(Character.toUpperCase(w.charAt(0))) == 0 ){
                    isUsed.put(Character.toUpperCase(w.charAt(0)), 1);
                    result = result + "["+w.charAt(0)+"]"+w.substring(1);
                    done = true;
                }
                else result = result + w;
                result += " ";
            }

            if(!done){
                result = "";
                for(String w: word){
                    result += w.charAt(0);
                    for(int j=1; j<w.length(); j++){
                        if(!done && isUsed.get(Character.toUpperCase(w.charAt(j))) == 0 ){
                            isUsed.put(Character.toUpperCase(w.charAt(j)), 1);
                            result = result + "["+w.charAt(j)+"]"+w.substring(j+1);
                            done = true;
                            break;
                        }
                        else result = result + w.charAt(j);
                    }
                    result += " ";
                }
            }

            if(!done) result = input;
            checked[i] = result;
        }
        for(String s: checked){
            bw.write(s+"\n");
        }
        bw.close();
    }
}