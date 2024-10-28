import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		
		int a = kbd.nextInt();
		int b = kbd.nextInt();
		int c = kbd.nextInt();
		
		long result = modular(a,b,c);
		
		System.out.println(result);
	}
	
	public static long modular(int a, int b, int c) {
		long result = 1;
		long base = a%c;
		
		while(b>0) {
			if(b%2 == 1) {
				result = (result * base) % c;
			}
			base = (base * base) % c;
			b /= 2;
		}
		
		return result;
	}

}
