import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		String[] names = new String[n];
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<n; i++) {
			names[i] = br.readLine();
			map.put(names[i], i+1);
		}
		
		for(int i=0; i<m; i++) {
			String question = br.readLine();
			if(question.charAt(0)>'0' && question.charAt(0)<='9') {
				bw.write(names[Integer.parseInt(question)-1]+"\n");
			}
			else {
				bw.write(map.get(question)+"\n");
			}
		}
		bw.close();
	}

}
