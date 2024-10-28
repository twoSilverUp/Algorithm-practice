import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fib(n-1) + fib(n-2);
    }
}