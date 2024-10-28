import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();

        System.out.println(n*(n-1)/2);   //max
        int element = 1;
        for(int i=0; i<n; i++){
            System.out.print(element+" ");
            element*=2;
        }

        System.out.println("\n"+ (n-1));
        for(int i=1; i<n+1; i++){
            System.out.print(i+" ");
        }
    }
}