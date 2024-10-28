import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		String line = kbd.nextLine();
		int dif = 'a' - 'A';
		for(int i=0; i<line.length(); i++) {
			char changed;
			if(line.charAt(i) > 'Z') {
				changed = (char) (line.charAt(i)-dif);
			}
			else {
				changed = (char)(line.charAt(i)+dif);
			}
			System.out.print(changed);
		}
	}

}
