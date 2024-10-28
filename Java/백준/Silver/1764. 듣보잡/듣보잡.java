import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int m = kbd.nextInt();
        Map<String, Integer> map = new HashMap<>();
        kbd.nextLine();

        for(int i=0; i<n; i++){
            map.put(kbd.nextLine(), 1);
        }

        List<String> list = new ArrayList<>();
        for(int i=0; i<m; i++){
            String name = kbd.nextLine();
            if(map.containsKey(name)){
                list.add(name);
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}