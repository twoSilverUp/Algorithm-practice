import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for(int i=0; i<n; i++) {
			list.add(i+1);
		}
		
		while(list.size() > 1) {
			list.poll();
			list.add(list.getFirst());
			list.poll();
		}
		System.out.println(list.getFirst());
	}

}
