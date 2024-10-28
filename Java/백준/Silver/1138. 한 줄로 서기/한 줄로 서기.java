import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int left_bigger[] = new int[n];

        for(int i=0; i<n; i++){
            left_bigger[i] = kbd.nextInt();
        }

        LinkedList<Integer> aligned = new LinkedList<Integer>();
        for(int i=n-1; i>=0; i--){
            int num = left_bigger[i];
            aligned.add(num, i+1);
        }

        for(int i=0; i<n; i++){
            System.out.print(aligned.get(i)+" ");
        }
    }
}