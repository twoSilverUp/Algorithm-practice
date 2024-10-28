import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        // 입력 받기
        int a = kbd.nextInt();
        int b = kbd.nextInt();
        int n = kbd.nextInt();

        StringBuilder result = new StringBuilder();
        int remainder = a % b;

        for (int i = 0; i < n; i++) {
            remainder *= 10;
            result.append(remainder/b);
            remainder %= b;
        }

        System.out.println(result.charAt(n-1));
    }
}
