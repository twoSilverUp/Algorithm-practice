import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Time[] meetings = new Time[n];
        for(int i=0; i<n; i++){
            String input[] = br.readLine().split(" ");
            meetings[i] = new Time(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        }
        Arrays.sort(meetings, Comparator.comparingInt(t -> t.start));
        Arrays.sort(meetings, Comparator.comparingInt(t -> t.end));

        int s = meetings[n-1].start;
        int e = meetings[n-1].end;
        int max = 1;
        for(int i=n-2; i>=0; i--){
            if(s >= meetings[i].end){
                s = meetings[i].start;
                max++;
            }
            else if(s<meetings[i].start){
                s = meetings[i].start;
            }
        }
        System.out.println(max);
    }
    static class Time{
        int start;
        int end;
        Time(int s, int e){
            start = s;
            end = e;
        }
    }
}