import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashSet<Integer> set = new HashSet<Integer>();
		int n = kbd.nextInt();
		kbd.nextLine();
		
		for(int i=0; i<n; i++) {
			String input = kbd.nextLine();
			if(input.equals("all")) {
				 set.addAll(IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList()));
			}
			else {
				String[] inputList = input.split(" ");
				
				if(inputList[0].equals("add")) {
					set.add(Integer.parseInt(inputList[1]));
				}
				else if(inputList[0].equals("remove")) {
					set.remove(Integer.parseInt(inputList[1]));
				}
				else if(inputList[0].equals("check")) {
					if(set.contains(Integer.parseInt(inputList[1]))) {
						bw.write(1+"\n");
					}
					else bw.write(0+"\n");
				}
				else if(inputList[0].equals("toggle")) {
					if(set.contains(Integer.parseInt(inputList[1]))) {
						set.remove(Integer.parseInt(inputList[1]));
					}
					else set.add(Integer.parseInt(inputList[1]));
				}
				else {
					set.clear();
				}
			}
		}
		bw.close();
	}
}
