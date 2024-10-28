import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		kbd.close();
		
		BigInteger result = BigInteger.valueOf(2).pow(n);
		System.out.println(result.subtract(BigInteger.valueOf(1)));
		
		if(n<=20) {
			hanoi(n,1,2,3);
		}
	}
	
	static void hanoi(int n, int sta, int tmp, int des) {
		if(n==1) System.out.println(sta+" "+des);
		else {
			 hanoi(n - 1, sta, des, tmp);
			 System.out.println(sta+" "+des);
	         hanoi(n - 1, tmp, sta, des);
		}
	}
}
