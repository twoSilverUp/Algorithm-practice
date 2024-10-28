import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            String track = kbd.next();
            map.compute(track, (key, oldValue)-> oldValue==null? 1: oldValue+1);
        }

        System.out.println(map.getOrDefault(kbd.next(), 0));
    }
}