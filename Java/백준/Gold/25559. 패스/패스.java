import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //공을 가진 사람 나와서 카드 한 장 뽑고 제자리로
        //자신으로부터 카드에 적힌 수만큼 오른쪽 사람한테 공 패스
        //뽑은 카드 버리고 더이상 이 카드는 못 뽑음
        Scanner kbd = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = kbd.nextInt();

        if(n==1){
            System.out.println(1);
        }
        else if(n%2==1){
            System.out.println(-1);
        }
        else{
            bw.write(n+" ");
            for(int i=n-1; i>0; i--){
               if(i%2==1){
                   bw.write(i+" ");
               }
               else{
                   bw.write((n-i)+" ");
               }
            }
        }
        bw.close();
    }
}