import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int k = kbd.nextInt();

        LinkedList<Integer> people = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toCollection(LinkedList::new));
        System.out.print("<");
        while(!people.isEmpty()){
            for(int i=0; i<k-1; i++){
                int survive = people.removeFirst();
                people.addLast(survive);
            }
            if(people.size() == 1){
                System.out.print(people.removeFirst()+">");
            }
            else System.out.print(people.removeFirst()+", ");
        }
    }
}