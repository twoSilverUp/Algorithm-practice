import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = kbd.nextInt();
        int m = kbd.nextInt();
        int a[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = kbd.nextInt();
            }
        }

        kbd.nextInt();
        int k = kbd.nextInt();
        int b[][] = new int[m][k];
        for(int i=0; i<m; i++){
            for(int j=0; j<k; j++){
                b[i][j] = kbd.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<k; j++){
                int mul = 0;
                for(int p=0; p<m; p++){     
                    mul += a[i][p]*b[p][j];
                }
                bw.write(mul+" ");
            }
            bw.write("\n");
        }
        bw.close();
    }
}