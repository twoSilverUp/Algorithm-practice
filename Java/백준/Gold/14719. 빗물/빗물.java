import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        int height = kbd.nextInt();
        int num = kbd.nextInt();
        int rain = 0;
        ArrayList<Integer> blocks = new ArrayList<Integer>();

        for(int i=0; i<num; i++){
            blocks.add(kbd.nextInt());
        }
        for(int i=height; i>0; i--){
            if(blocks.indexOf(i) != blocks.lastIndexOf(i)){
                int prev = blocks.indexOf(i);
                int now = 0;
                while(blocks.indexOf(i) != blocks.lastIndexOf(i)){
                    blocks.set(prev, i-1);
                    now = blocks.indexOf(i);
                    rain += now - prev - 1;
                    prev = now;
                }
                blocks.set(now, i-1);
            }
            else if(blocks.contains(i)){
                blocks.set(blocks.indexOf(i), i-1);
            }
        }
        System.out.println(rain);
    }
}