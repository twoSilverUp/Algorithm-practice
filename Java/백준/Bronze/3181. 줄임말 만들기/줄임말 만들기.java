import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String[] line = kbd.nextLine().split(" ");
        String abb = "" + Character.toUpperCase(line[0].charAt(0));

        for(int i=1; i<line.length; i++){
            String words = line[i];
            if(!words.equalsIgnoreCase("i") &&
                    !words.equalsIgnoreCase("pa") &&
                    !words.equalsIgnoreCase("te") &&
                    !words.equalsIgnoreCase("ni") &&
                    !words.equalsIgnoreCase("niti") &&
                    !words.equalsIgnoreCase("a") &&
                    !words.equalsIgnoreCase("ali") &&
                    !words.equalsIgnoreCase("nego") &&
                    !words.equalsIgnoreCase("no") &&
                    !words.equalsIgnoreCase("ili")){

                abb = abb + Character.toUpperCase(words.charAt(0));
            }
        }
        System.out.println(abb);
    }
}