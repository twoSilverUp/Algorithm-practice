import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		String input = kbd.nextLine();
		String inputs[] = input.split(" ");
		
		BigInteger money = new BigInteger(inputs[0]);
		BigInteger num = new BigInteger(inputs[1]);
		
		System.out.println(money.divide(num));
		System.out.println(money.remainder(num));
	}

}
