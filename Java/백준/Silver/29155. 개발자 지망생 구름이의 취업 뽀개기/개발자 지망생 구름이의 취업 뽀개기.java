import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int probs[] = new int[5];
        for(int i=0; i<5; i++){
            probs[i] = kbd.nextInt();
        }
        List<Integer> timeFirst = new ArrayList<Integer>();
        List<Integer> timeSecond = new ArrayList<Integer>();
        List<Integer> timeThird = new ArrayList<Integer>();
        List<Integer> timeForth = new ArrayList<Integer>();
        List<Integer> timeFifth = new ArrayList<Integer>();

        for(int i=0; i<n; i++){
            int level = kbd.nextInt();
            switch(level){
                case 1:
                    timeFirst.add(kbd.nextInt());
                    break;
                case 2:
                    timeSecond.add(kbd.nextInt());
                    break;
                case 3:
                    timeThird.add(kbd.nextInt());
                    break;
                case 4:
                    timeForth.add(kbd.nextInt());
                    break;
                case 5:
                    timeFifth.add(kbd.nextInt());
                    break;
            }
        }
        Collections.sort(timeFirst);
        Collections.sort(timeSecond);
        Collections.sort(timeThird);
        Collections.sort(timeForth);
        Collections.sort(timeFifth);

        int sum=0;
        for(int i=0; i<5; i++){
            for(int j=0; j<probs[i]; j++){
                switch(i+1){
                    case 1:
                        sum += timeFirst.get(j);
                        if(j!=0){
                            sum+=timeFirst.get(j) - timeFirst.get(j-1);
                        }
                        break;
                    case 2:
                        sum+=timeSecond.get(j);
                        if(j!=0){
                            sum+=timeSecond.get(j) - timeSecond.get(j-1);
                        }
                        break;
                    case 3:
                        sum+=timeThird.get(j);
                        if(j!=0){
                            sum+=timeThird.get(j) - timeThird.get(j-1);
                        }
                        break;
                    case 4:
                        sum+=timeForth.get(j);
                        if(j!=0){
                            sum+=timeForth.get(j) - timeForth.get(j-1);
                        }
                        break;
                    case 5:
                        sum+=timeFifth.get(j);
                        if(j!=0){
                            sum+=timeFifth.get(j) - timeFifth.get(j-1);
                        }
                        break;
                }
            }
            sum+=60;
        }
        System.out.println(sum-60);
    }
}
