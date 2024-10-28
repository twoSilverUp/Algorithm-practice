import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        long startX = kbd.nextLong();
        long startY = kbd.nextLong();
        long endX = kbd.nextLong();
        long endY = kbd.nextLong();

        long min = Long.MAX_VALUE;
        long best = 0;
        for(int i=0; i<n; i++){
            int points = kbd.nextInt();
            long beforeX = startX;
            long beforeY = startY;
            long dist = 0;
            long x = kbd.nextLong();
            long y = kbd.nextLong();

            for(int j=0; j<points-1; j++){
                dist += (Math.abs(beforeX - x) + Math.abs(beforeY - y));
                beforeX = x;
                beforeY = y;
                x = kbd.nextLong();
                y = kbd.nextLong();
            }
            dist += (Math.abs(beforeX - x) + Math.abs(beforeY - y));
            dist += (Math.abs(endX - x) + Math.abs(endY - y));

            if(min>dist) {
                min = dist;
                best = i+1;
            }
        }

        System.out.println(best);
    }
}