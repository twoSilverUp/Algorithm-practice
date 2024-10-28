import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		BigInteger num = new BigInteger(input);
		
		if(input.contains("7")) {
			if(num.remainder(new BigInteger("7")).equals(new BigInteger("0"))) {
				System.out.println(3);
			}
			else System.out.println(2);
		}
		else {
			if(num.remainder(new BigInteger("7")).equals(new BigInteger("0"))) {
				System.out.println(1);
			}
			else System.out.println(0);
		}
	}

}
