import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = kbd.nextInt();
        int k = kbd.nextInt();
        LinkedList<Integer> list = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toCollection(LinkedList::new));

        int index = k-1;
        bw.write("<");
        while(!list.isEmpty()){
            for(int i=0; i<k-1; i++){
                int move = list.removeFirst();
                list.addLast(move);
            }
            bw.write(list.removeFirst()+"");
            if(!list.isEmpty()) bw.write(", ");
        }
        bw.write(">");
        bw.close();
    }
}