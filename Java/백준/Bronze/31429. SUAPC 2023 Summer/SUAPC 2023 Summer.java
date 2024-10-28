import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int corrects[] = new int[11];
		corrects[0] = 12;
		corrects[1] = 11;
		corrects[2] = 11;
		corrects[3] = 10;
		corrects[4] = 9;
		corrects[5] = 9;
		corrects[6] = 9;
		corrects[7] = 8;
		corrects[8] = 7;
		corrects[9] = 6;
		corrects[10] = 6;
		
		int times[] = new int[11];
		times[0] = 1600;
		times[1] = 894;
		times[2] = 1327;
		times[3] = 1311;
		times[4] = 1004;
		times[5] = 1178;
		times[6] = 1357;
		times[7] = 837;
		times[8] = 1055;
		times[9] = 556;
		times[10] = 773;
		
		Scanner kbd = new Scanner(System.in);
		int num = kbd.nextInt();
		
		System.out.println(corrects[num-1] + " " + times[num-1]);
	}

}
