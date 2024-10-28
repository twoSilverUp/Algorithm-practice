import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		int lines = kbd.nextInt();
		int toFind = kbd.nextInt();
		kbd.nextLine();
		
		for(int i=0; i<lines; i++) {
			String[] infor = kbd.nextLine().split(" ");
			map.put(infor[0], infor[1]);
		}
		
		for(int i=0; i<toFind; i++) {
			System.out.println(map.get(kbd.nextLine()));
		}
	}

}
