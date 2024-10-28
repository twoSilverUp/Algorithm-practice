import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		ArrayList<Integer> heights = new ArrayList();
		int sumOfNine = 0;
		for(int i=0; i<9; i++) {
			heights.add(kbd.nextInt());
			sumOfNine+=heights.get(i);
		}
		
		AA:
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(i!=j) {
					if((sumOfNine-heights.get(i)-heights.get(j)) == 100) {
						int element = heights.get(j);
						heights.remove(i);
						heights.remove(heights.indexOf(element));
						Collections.sort(heights);;
						break AA;
					}
				}
			}
		}
		for(int i=0; i<7; i++) {
			System.out.println(heights.get(i));
		}
	}

}
