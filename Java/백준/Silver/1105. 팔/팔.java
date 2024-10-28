import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String[] input = kbd.nextLine().split(" ");
        String l = input[0];
        String r = input[1];
        int num = 0;

        if(l.length() == r.length()){
            boolean wasSame = true;
            for(int i=0; i<l.length() && wasSame; i++){
                if(l.charAt(i) != r.charAt(i)){
                    wasSame = false;
                }
                if(l.charAt(i) == '8' && wasSame) {
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}