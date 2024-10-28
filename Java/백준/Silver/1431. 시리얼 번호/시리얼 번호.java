import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		kbd.nextLine();
		String[] input = new String[n];
		for(int i=0; i<n; i++) {
			input[i] = kbd.nextLine();
		}
		
		Arrays.sort(input, (s1,s2)->{
			if(s1.length() != s2.length()) {
				return Integer.compare(s1.length(), s2.length());
			}
			else {
				if(sumOfNumber(s1)==0 && sumOfNumber(s2)==0) {
					return s1.compareTo(s2);
				}
				else {
					if(sumOfNumber(s1)!=sumOfNumber(s2)) {
						return Integer.compare(sumOfNumber(s1), sumOfNumber(s2));
					}
					else {
						return s1.compareTo(s2);
					}
				}
			}
		});
		for(int i=0; i<n; i++) {
			System.out.println(input[i]);
		}
	}
	
	static int sumOfNumber(String str) {
		int sum=0;
		for(char c:str.toCharArray()) {
			if(Character.isDigit(c)) sum+=Integer.parseInt(c+"");
		}
		return sum;
	}

}
