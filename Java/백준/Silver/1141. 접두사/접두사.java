import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner kbd = new Scanner(System.in);
        int num = Integer.parseInt(kbd.nextLine());
        String words[] = new String[num];

        for(int i=0; i<num; i++) {
            words[i] = kbd.nextLine();
        }
        Arrays.sort(words, (s1, s2)-> {int len = Integer.compare(s1.length(), s2.length()); return len != 0? len: s1.compareTo(s2);});

        int silver = num;
        for(int i=0; i<num; i++){
            for(int j=i+1; j<num; j++){
                if(words[i].equals(words[j].substring(0, words[i].length()))){
                    silver--;
                    break;
                }
            }
        }
        System.out.println(silver);
    }

}