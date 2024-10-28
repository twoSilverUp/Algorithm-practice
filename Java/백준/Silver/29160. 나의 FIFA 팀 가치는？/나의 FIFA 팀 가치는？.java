import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int k = kbd.nextInt();
        List<PriorityQueue<Integer>> values = new ArrayList<>();

        for(int i=0; i<11; i++){
            values.add(new PriorityQueue<>(Comparator.reverseOrder()));
        }

        for(int i=0; i<n; i++){
            int position = kbd.nextInt();
            int val = kbd.nextInt();
            values.get(position-1).add(val);
        }

        for(int i=0; i<k; i++){
            for(int j=0; j<11; j++){
                if(!values.get(j).isEmpty()){
                    int before = values.get(j).remove();
                    values.get(j).add(Math.max(0, before-1));
                }
            }
        }

        int sum=0;

        for(int i=0; i<11; i++){
            if(!values.get(i).isEmpty()){
                sum+=values.get(i).remove();
            }
        }
        System.out.println(sum);
    }
}
