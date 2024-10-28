import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean have = false;
		
		for(int i=1; i<n; i++) {
			int sum = i;
			int num = i;
			
			if(i<10) {
				if(2*sum == n) {
					System.out.println(i);
					have = true;
					break;
				}
			}
			else if(i<100) {
				int ten = num/10;
				num %= 10;
				sum += (ten+num);
				if(sum == n) {
					System.out.println(i);
					have = true;
					break;
				}
			}
			else if(i<1000) {
				int hun = num/100;
				num%=100;
				int ten = num/10;
				num %= 10;
				sum += (hun+ten+num);
				if(sum == n) {
					System.out.println(i);
					have = true;
					break;
				}
			}
			else if(i<10000) {
				int tho = num/1000;
				num%=1000;
				int hun = num/100;
				num%=100;
				int ten = num/10;
				num %= 10;
				sum += (tho+hun+ten+num);
				if(sum == n) {
					System.out.println(i);
					have = true;
					break;
				}
			}
			else if(i<100000) {
				int tenTho = num/10000;
				num%=10000;
				int tho = num/1000;
				num%=1000;
				int hun = num/100;
				num%=100;
				int ten = num/10;
				num %= 10;
				sum += (tenTho+tho+hun+ten+num);
				if(sum == n) {
					System.out.println(i);
					have = true;
					break;
				}
			}
			else if(i<1000000) {
				int hunTho = num/100000;
				num%=100000;
				int tenTho = num/10000;
				num%=10000;
				int tho = num/1000;
				num%=1000;
				int hun = num/100;
				num%=100;
				int ten = num/10;
				num %= 10;
				sum += (hunTho+tenTho+tho+hun+ten+num);
				if(sum == n) {
					System.out.println(i);
					have = true;
					break;
				}
			}
		}
		if(!have) System.out.println(0);
	}

}
