import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			int money = Integer.parseInt(br.readLine());
			int q=0,d=0,ni=0,p=0;
			
			while(money-25>=0) {
				q++;
				money-=25;
			}
			while(money-10>=0) {
				d++;
				money-=10;
			}
			while(money-5>=0) {
				ni++;
				money-=5;
			}
			while(money-1>=0) {
				p++;
				money-=1;
			}
			
			bw.write(q+" "+d+" "+ni+" "+p+"\n");
			
		}
		br.close();
		bw.close();
	}

}
