import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		List<Integer> scores = new LinkedList<Integer>();
		int n = kbd.nextInt();
		int newScore = kbd.nextInt();
		int length = kbd.nextInt();
		int dupNum = 0;
		
		for(int i=0; i<n; i++) {
			int input = kbd.nextInt();
			if(input==newScore) dupNum++;
			scores.add(input);
		}
		scores.add(newScore);
		scores.sort(Collections.reverseOrder());
		
		if(length<=scores.size() && scores.get(length-1)>newScore) {
			System.out.println(-1);
		}
		else if(length<=scores.size() && scores.indexOf(newScore)+dupNum>length-1) {
			System.out.println(-1);
		}
		else {
			System.out.println(scores.indexOf(newScore)+1);
		}
	}

}
