import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        for(int i=0; i<n; i++){
            int input = kbd.nextInt();
            if(input%2==0)
                System.out.println(input+" is even");
            else
                System.out.println(input + " is odd");
        }
    }
}