import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int m = kbd.nextInt();
        int sum[] = new int[n];

        sum[0] = kbd.nextInt();
        for(int i=1; i<n; i++){
            sum[i] = sum[i-1] + kbd.nextInt();
        }

        for(int i=0; i<m; i++){
            int start = kbd.nextInt();
            int end = kbd.nextInt();
            if(start == 1) System.out.println(sum[end-1]);
            else System.out.println(sum[end-1] - sum[start-2]);
        }
    }
}