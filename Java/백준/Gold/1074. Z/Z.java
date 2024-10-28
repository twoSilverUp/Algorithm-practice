import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int r = kbd.nextInt();
        int c = kbd.nextInt();

        System.out.println(z(n,r,c));
    }

    public static int z(int n, int r, int c){
        if(n == 1){
            if(r==0 && c==0){
                return 0;
            }
            else if(r==0 && c==1){
                return 1;
            }
            else if(r==1 && c==0){
                return 2;
            }
            else return 3;
        }
        else{
            int smaller = (int)Math.pow(2, n-1);
            if(r<smaller && c<smaller){
                return z(n-1, r, c);
            }
            else if(r<smaller){
                int num = (int)Math.pow(Math.pow(2, n-1),2);
                return z(n-1, r, c-smaller) + num;
            }
            else if(c<smaller){
                int num = (int)Math.pow(Math.pow(2, n-1),2);
                return z(n-1, r-smaller, c) + num*2;
            }
            else{
                int num = (int)Math.pow(Math.pow(2, n-1),2);
                return z(n-1, r-smaller, c-smaller) + num*3;
            }
        }
    }
}