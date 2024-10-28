import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int sangB = kbd.nextInt();
        int jungB = kbd.nextInt();
        int haB = kbd.nextInt();
        int coke = kbd.nextInt();
        int soda = kbd.nextInt();

        int set = Math.min(sangB,Math.min(jungB, haB)) + Math.min(coke, soda) - 50;
        System.out.println(set);
    }
}