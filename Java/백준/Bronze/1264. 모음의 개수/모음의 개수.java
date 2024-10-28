import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		String line = kbd.nextLine();
		
		while(!line.equals("#")) {
			int count = 0;
			for(int i=0; i<line.length(); i++) {
				switch(line.charAt(i)) {
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
				}
			}
			System.out.println(count);
			line = kbd.nextLine();
		}
	}
}
