import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        LinkedList<Integer> times = new LinkedList<>();

        for(int i=0; i<n; i++){
            times.add(kbd.nextInt());
        }

        int total = 0;
        for(int i=n; i>0; i--){
            int min = times.stream().min(Integer::compare).orElseThrow();
            total += min*n;
            times.remove(times.indexOf(min));
            n--;
        }
        System.out.println(total);
    }
}