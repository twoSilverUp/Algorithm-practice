import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String input[] = br.readLine().split(" ");
            int ta = Integer.parseInt(input[0]);
            int tb = Integer.parseInt(input[1]);
            int va = Integer.parseInt(input[2]);
            int vb = Integer.parseInt(input[3]);

            if(ta*va <= tb*vb){
                bw.write(tb*vb+"\n");
            }
            else if(va==1 && vb==1){
                bw.write(ta+"\n");
            }
            else{
                int rest = ta*va - tb*vb;
                int restCount = rest / ta;

                if(restCount == 0){     //모든 일을 다 한 경우
                    bw.write((ta*va)+"\n");
                }
                else if(rest % ta == 0){       //B작업이 끝날 때 A 작업도 끝나는 경우
                                                // == 둘의 작업이 동시에 끝난 경우
                    int each =(int) Math.ceil(restCount / 2.0);
                    bw.write((tb*vb+each*ta) + "\n");
                }
                else{
                    int sang = tb*vb+rest%ta;
                    int doe = tb*vb;
                    if(restCount % 2 == 0){
                        restCount /= 2;
                        bw.write(Math.max(sang+restCount*ta, doe+restCount*ta)+"\n");
                    }
                    else{
                        restCount /= 2;
                        bw.write(Math.max(sang+restCount*ta, doe+(restCount+1)*ta)+"\n");
                    }
                }
            }
        }
        bw.close();
    }
}