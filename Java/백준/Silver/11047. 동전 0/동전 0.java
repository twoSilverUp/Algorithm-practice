import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		int money = kbd.nextInt();
		ArrayList<Integer> moneys = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			moneys.add(kbd.nextInt());
		}
		
		int count = 0;
		for(int i=moneys.size()-1; i>=0; i--) {
			while(money-moneys.get(i)>=0) {
				count++;
				money-=moneys.get(i);
			}
			if(money==0) break;
		}
		
		System.out.println(count);
	}

}
