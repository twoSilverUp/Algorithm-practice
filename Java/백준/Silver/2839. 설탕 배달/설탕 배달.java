import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int kg = kbd.nextInt();
        int num[] = new int[kg+1];
        num[0] = 0;
        num[1] = -1;
        num[2] = -1;
        num[3] = 1;

        for(int i=4; i<kg+1; i++){
            if(i!=4){
                if(num[i-3] == -1 && num[i-5] == -1){
                    num[i] = -1;
                }
                else if(num[i-3] != -1 && num[i-5] != -1){
                    num[i] = Math.min(num[i-3], num[i-5]) + 1;
                }
                else if(num[i-3] != -1){
                    num[i] = num[i-3]+1;
                }
                else{
                    num[i] = num[i-5]+1;
                }
            }
            else num[i] = -1;
        }
        System.out.println(num[kg]);
    }
}