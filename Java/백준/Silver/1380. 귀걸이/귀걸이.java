import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int senario = 1;
		int n = Integer.parseInt(br.readLine());
		while (n != 0) {
			List<String> students = new LinkedList<String>();
			String student[] = new String[n];
			for(int i=0; i<n; i++) {
				String s = br.readLine();
				student[i] = s;
			}
			for(int i=0; i<2*n-1; i++) {
				int index = Integer.parseInt(br.readLine().split(" ")[0]);
				if(students.contains(student[index-1])) {
					students.remove(students.indexOf(student[index-1]));
				}
				else students.add(student[index-1]);
			}
			bw.write(senario + " " + students.get(0)+"\n");
			n = Integer.parseInt(br.readLine());
			senario++;
		}
		bw.close();
	}

}
