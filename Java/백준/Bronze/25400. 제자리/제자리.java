import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String cards[] = br.readLine().split(" ");

        int now = 1;
        int deleted = 0;
        for(int i=0; i<n; i++){
            if(Integer.parseInt(cards[i]) == now){
                now++;
            }
            else
                deleted++;
        }
        System.out.println(deleted);
    }
}