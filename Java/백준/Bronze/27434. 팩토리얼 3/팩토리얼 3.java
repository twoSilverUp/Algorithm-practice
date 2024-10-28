import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fact(1, n));
    }
    public static BigInteger fact(int a, int n){
        BigInteger num = BigInteger.valueOf(a);

        if(a<n){
            int b = (a+n)/2;
            num = fact(a,b).multiply(fact(b+1, n));
        }
        return num;
    }
}