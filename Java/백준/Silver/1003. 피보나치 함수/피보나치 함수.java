import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int count1[],count0[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		count1 = new int[41];
		count0 = new int[41];
		count1[1] = 1;
		count0[0] = 1;
		
		for(int i=2; i<41; i++) {
			count0[i] = count0[i-1]+count0[i-2];
			count1[i] = count1[i-1]+count1[i-2];
		}
		
		for(int i=0; i<n; i++) {
			int input = Integer.parseInt(br.readLine());
			bw.write(count0[input]+" "+count1[input]+"\n");
		}
		bw.close();
	}
}
