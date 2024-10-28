import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        long xOfFir[] = new long[4];
        long yOfFir[] = new long[4];
        long xOfSec[] = new long[4];
        long yOfSec[] = new long[4];

        for(int i=0; i<4; i++){
            xOfFir[i] = kbd.nextInt();
            yOfFir[i] = kbd.nextInt();
        }
        for(int i=0; i<4; i++){
            xOfSec[i] = kbd.nextInt();
            yOfSec[i] = kbd.nextInt();
        }

        long sumOfx1 = Arrays.stream(xOfFir).sum();
        long sumOfy1 = Arrays.stream(yOfFir).sum();
        long sumOfx2 = Arrays.stream(xOfSec).sum();
        long sumOfy2 = Arrays.stream(yOfSec).sum();

        long am = sumOfy1 - sumOfy2;
        long bm = sumOfx1 - sumOfx2;
        
        if(am==0) {
            System.out.print(0+" ");
            long ay = sumOfy1;
            if(ay==0) System.out.println(0);
            else{
                long by = 4;
                long gcd = gcd(ay, by);

                ay/=gcd;
                by/=gcd;
                if(by<0){
                    ay = -ay;
                    by = -by;
                }
                if(by==1) System.out.println(ay);
                else{
                    System.out.println(ay+"/"+by);
                }
            }
        }
        else{
            long gcd = gcd(am,bm);
            am /= gcd;
            bm /= gcd;

            if(bm<0){
                am = -am;
                bm = -bm;
            }

            if (bm==1) {
                System.out.print(am+" ");
                long ay = sumOfy1-am*sumOfx1;
                bm=4;
                gcd = gcd(ay, bm);
                ay/=gcd;
                bm/=gcd;

                if(bm<0){
                    ay*=(-1);
                    bm*=(-1);
                }

                if(ay==0) System.out.println(0);
                else if(bm==1) System.out.println(ay);
                else System.out.println(ay+"/"+bm);

            }
            else {
                if(bm<0){
                    am*=(-1);
                    bm*=(-1);
                }
                System.out.print(am+"/"+bm+" ");

                long ay = bm*sumOfy1-am*sumOfx1;
                bm*=4;
                gcd = gcd(ay, bm);
                ay /= gcd;
                bm/=gcd;

                if(bm<0){
                    ay*=(-1);
                    bm*=(-1);
                }

                if(ay==0) System.out.println(0);
                else if(bm==1) System.out.println(ay);
                else System.out.println(ay+"/"+bm);
            }
        }
    }

    static long gcd(long a, long b){
        while(b != 0){
            long tmp = b;
            b = a%b;
            a = tmp;
        }
        return a;
    }
}