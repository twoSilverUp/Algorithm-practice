import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int m = kbd.nextInt();

        back(n,m,1,new ArrayList<Integer>());
    }

    public static void back(int n, int m, int start, ArrayList<Integer> path){
        if (path.size() == m){
            for(int num : path){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        else{
            for(int i=start; i<n+1; i++){
                ArrayList<Integer> newPath = new ArrayList<>(path);
                if(!newPath.contains(i)){
                    newPath.add(i);
                    back(n, m, i, newPath);
                }
            }
        }
    }
}