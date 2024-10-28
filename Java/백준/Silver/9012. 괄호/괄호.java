import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            char[] input = br.readLine().toCharArray();
            Stack<Character> stack = new Stack<>();
            boolean wasRight = true;
            for(char c: input){
                if(c == '(') stack.add(c);
                else{
                    if(stack.isEmpty()) {
                        wasRight = false;
                        break;
                    }
                    else stack.pop();
                }
            }
            if(stack.isEmpty() && wasRight) bw.write("YES\n");
            else bw.write("NO\n");
        }
        bw.close();
    }
}