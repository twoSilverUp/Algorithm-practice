import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] tap = new int[n + 1];
        tap[0] = 0;

        for (int i = 1; i <= n; ++i) {
            tap[i] = Integer.parseInt(br.readLine()) + tap[i-1];
        }

        double l = Double.parseDouble(br.readLine());
        int q = Integer.parseInt(br.readLine());
        double x;

        for (int i = 0; i < q; ++i) {
            if (tap[n] < l) {
                x = 0.00;
            }

            else {
                int num = Integer.parseInt(br.readLine());
                double center = (double) (tap[num - 1] + tap[num]) / 2;
                x = center - l / 2;
                if (x < 0) {
                    x = 0.00;
                }
                if (x > tap[n] - l) {
                    x = tap[n] - l;
                }
            }
            bw.write(String.format("%.2f%n", x));
        }
        bw.close();
    }
}
