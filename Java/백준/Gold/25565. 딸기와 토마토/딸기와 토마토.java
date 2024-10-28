import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = kbd.nextInt();
        int m = kbd.nextInt();
        int k = kbd.nextInt();

        int field[][] = new int[n][m];
        int count = 0;
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        int xx=-1;
        int yy=-1;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                field[i][j] = kbd.nextInt();
                if(field[i][j] == 1){
                    if(x.contains(i)){
                        xx = i+1;
                    }
                    if(y.contains(j)){
                        yy=j+1;
                    }
                    x.add(i);
                    y.add(j);
                    count++;
                }
            }
        }

        if(count==k){
            bw.write(count+"\n");
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(field[i][j] == 1){
                        bw.write((i+1)+" "+(j+1)+" ");
                    }
                }
            }
        }
        else if(count==2*k){
            bw.write("0\n");
        }
        else if(xx==-1 || yy==-1){
            count = count-2*(count-k);
            bw.write(count+"\n");
            if(xx==-1){
                for(int i=0; i<count; i++){
                    bw.write((x.get(k-count+i+1))+" "+ yy+" ");
                }
            }
            else{
                for(int i=0; i<count; i++){
                    bw.write(xx+" "+ (y.get(k-count+i+1))+" ");
                }
            }
        }
        else if(count == 2*k-1){
            bw.write("1\n"+xx+" "+yy);
        }

        bw.close();
    }
}