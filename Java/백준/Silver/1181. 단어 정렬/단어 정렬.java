import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String words[] = new String[n];
		
		for(int i=0; i<n; i++) {
			words[i] = br.readLine();
		}
		
		Arrays.sort(words, (s1, s2)->{
			if(s1.length() != s2.length()) {
				return Integer.compare(s1.length(), s2.length());
			}else {
				return s1.compareTo(s2);
			}
		});
		
        int n2 = 1;
        for (int i = 1; i < n; i++) {
            if (!words[i].equals(words[i - 1])) {
                words[n2++] = words[i];
            }
        }
        
        for (int i = 0; i < n2; i++) {
            System.out.println(words[i]);
        }
		
	}

}
