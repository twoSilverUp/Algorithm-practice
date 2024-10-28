import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		int hour = kbd.nextInt();
		int min = kbd.nextInt();
		int sec = kbd.nextInt();
		int need = kbd.nextInt();
		
		int H=0, M=0;
		while(need - 3600>=0) {
			H++;
			need-=3600;
		}
		while(need-60>=0) {
			M++;
			need-=60;
		}
		
		hour+=H; min+=M; sec+=need;
		while(sec>59) {
			min++;
			sec-=60;
		}
		while(min>59) {
			hour++;
			min-=60;
		}
		
		while(hour>23) {
			hour-=24;
		}
		
		System.out.println(hour+" "+min+" "+sec);
		
	}

}
