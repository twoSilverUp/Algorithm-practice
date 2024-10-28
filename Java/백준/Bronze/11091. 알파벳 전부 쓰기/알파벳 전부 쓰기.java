import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        kbd.nextLine();
        for(int i=0; i<n; i++){
            String line = kbd.nextLine();

            char current = 'a';
            List<Character> empty = new ArrayList<>();

            for(int j=0; j<26; j++){
                if(line.indexOf(current) == -1 && line.indexOf(Character.toUpperCase(current)) == -1){
                    empty.add(current);
                }
                current++;
            }
            if(empty.isEmpty())
                System.out.println("pangram");
            else{
                System.out.printf("missing ");
                for(char missed: empty)
                    System.out.printf(missed+"");
                System.out.printf("\n");
            }
        }
    }
}