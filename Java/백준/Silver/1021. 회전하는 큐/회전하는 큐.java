import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		for(int i=0; i<Integer.parseInt(input[0]); i++) {
			queue.add(i+1);
		}
		
		String[] wants = br.readLine().split(" ");
		
		int count=0;
		for(int i=0; i<Integer.parseInt(input[1]); i++) {
			int want = Integer.parseInt(wants[i]);
			if(queue.getFirst()!=want) { 
				if(queue.indexOf(want) <= queue.size()/2) {
					while(queue.indexOf(want)!=0) {
						queue.addLast(queue.getFirst());
						queue.removeFirst();
						count++;
					}
					queue.removeFirst();
				}
				else {
					while(queue.indexOf(want) != 0) {
						queue.addFirst(queue.getLast());
						queue.removeLast();
						count++;
					}
					queue.removeFirst();
				}
			}
			else queue.removeFirst();
		}
		
		bw.write(Integer.toString(count));
		br.close();
		bw.close();
	}

}
