import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		Map<Integer, Integer> num = new HashMap<Integer, Integer>();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = kbd.nextInt();
		for(int i=0; i<n; i++) {
			int key = kbd.nextInt();
			num.compute(key, (k, oldValue)->(oldValue==null)? 1: oldValue+1);
		}
		
		int m = kbd.nextInt();
		for(int i=0; i<m; i++) {
			int key = kbd.nextInt();
			int result = num.getOrDefault(key, 0);
			bw.write(result+" ");
		}
		bw.close();
	}
}
