import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        HashMap<Integer, Boolean> isIn = new HashMap<>();
        for(int i=0; i<n; i++){
            isIn.put(kbd.nextInt(), true);
        }

        n = kbd.nextInt();
        for(int i=0; i<n; i++){
            int num = kbd.nextInt();
            isIn.putIfAbsent(num, false);
            if(isIn.get(num)){
                System.out.println(1);
            }
            else System.out.println(0);
        }
    }
}