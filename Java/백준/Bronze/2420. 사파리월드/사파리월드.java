import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		long n = kbd.nextLong();
		long m = kbd.nextLong();
		if(n>m) System.out.println(n-m);
		else System.out.println(m-n);
	}

}
