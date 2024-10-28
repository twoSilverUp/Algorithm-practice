import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	     int N = scanner.nextInt();
	     int L = scanner.nextInt();

	     for (int length = L; length <= 100; length++) {
	         int numerator = 2 * N - length * (length - 1);
	         int denominator = 2 * length;

	         if (numerator % denominator == 0 && numerator >= 0) {
	             int start = numerator / denominator;
	                
	             if (start < 0) {
	                 continue;
	             }

	             for (int i = 0; i < length; i++) {
	                 System.out.print((start + i) + " ");
	             }
	             return;
	         }
	     }
       System.out.println(-1);
	}
}
