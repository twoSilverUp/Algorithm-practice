import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        LinkedList<Index> list = new LinkedList<>();
        for(int i=0; i<n; i++){
            list.add(new Index(kbd.nextInt(), kbd.nextInt()));
        }

        list.sort(Comparator.comparing(val->val.y));
        list.sort(Comparator.comparing(val -> val.x));

        for(Index val : list){
            System.out.println(val.x + " " + val.y);
        }
    }

    static class Index{
        int x;
        int y;
        Index(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}