import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> scores = new HashMap<>();
        List<String> times = new ArrayList<>();
        for(int i=0; i<8; i++){
            String[] input = br.readLine().split(" ");
            times.add(input[0]);
            scores.put(input[0], input[1]);
        }
        Collections.sort(times);

        int sumR = 0, sumB = 0;
        for(int i=0; i<8; i++){
            if(scores.get(times.get(i)).equals("B")){
                if(i<3){
                    sumB += (10 - 2*i);
                }
                else{
                    sumB += (8 - i);
                }
            }
            else {
                if(i<3){
                    sumR += (10 - 2*i);
                }
                else{
                    sumR += (8 - i);
                }
            }
        }

        if(sumB > sumR) System.out.println("Blue");
        else if(sumB == sumR){
            if(scores.get(times.get(0)).equals("B")) System.out.println("Blue");
            else System.out.println("Red");
        }
        else System.out.println("Red");
    }
}