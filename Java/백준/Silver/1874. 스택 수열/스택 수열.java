import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = kbd.nextInt();
		List<Integer> stack = new ArrayList<Integer>();
		List<Character> pp = new ArrayList<Character>();
		
		int last = 1;
		boolean stop = false;
		
		for(int i=0; i<n; i++) {
			int num = kbd.nextInt();
			
			if(stack.isEmpty()) {
				for(int j=last; j<num+1; j++) {
					stack.add(j);
					pp.add('+');
				}
				stack.remove(stack.size()-1);
				pp.add('-');
				last = num+1;
			}
			else {
				if(stack.get(stack.size()-1)>num) {
					bw.write("NO");
					stop = true;
					break;
				}
				else {
					int j=last;
					for(; j<num+1; j++) {
						stack.add(j);
						pp.add('+');
					}
					last = j;
					stack.remove(stack.size()-1);
					pp.add('-');
				}
			}
		}
		
		if(!stop) {
			for(int i=0; i<pp.size(); i++) {
				bw.write(pp.get(i)+"\n");
			}
		}
		bw.close();
	}
}
