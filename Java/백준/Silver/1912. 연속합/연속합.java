import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		int sequence[] = new int[n];
		
		for(int i=0; i<n; i++) {
			sequence[i] = kbd.nextInt();
		}
		
		System.out.println(bigSum(sequence));
	}
	
	static int bigSum(int a[]) {
		int result = Integer.MIN_VALUE;
		int partialSum = 0;
		
		for(int i=0; i<a.length; i++) {
			partialSum = Math.max(0, partialSum)+a[i];
			result = Math.max(partialSum, result);
		}
		
		return result;
	}

}
