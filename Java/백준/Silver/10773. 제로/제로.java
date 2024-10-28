import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> nums = new LinkedList<Integer>();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			int input = Integer.parseInt(br.readLine());
			if(input == 0) {
				sum -= nums.get(nums.size()-1);
				nums.remove(nums.size()-1);
			}
			else {
				sum+=input;
				nums.add(input);
			}
		}
		
		System.out.println(sum);
		
	}

}
