import java.util.*;

public class Day2_1 {

    static ArrayList<ArrayList<Integer>> a = new ArrayList<>();
    public static void main(String[] args) {
        cal();
    }
    
    public static void input(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if(input.equals("end")){
                break;
            }
            ArrayList<Integer> b = new ArrayList<>();
            String[] numbers = input.split(" ");
            for (String number : numbers) {
                b.add(Integer.parseInt(number));
            }
            a.add(b);
        }
        sc.close();
    }

    public static void cal(){
        input();
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            int count = 0;
            sum++;
            if(a.get(i).get(0) >= a.get(i).get(1)){
                for (int x : a.get(i)) {
                    if(count == a.get(i).size()-1){
                        break;
                    }
                    else{
                        int y = a.get(i).get(count+1);
                        int z = x-y;
                        if(z <= 3 && z > 0){
                            count++;
                        }
                        else{
                            sum--;
                            break;
                        }
                    }

                }
            }
            else if(a.get(i).get(0) <= a.get(i).get(1)){
                for (int x : a.get(i)) {
                    if(count == a.get(i).size()-1){
                        break;
                    }
                    else{
                        int y = a.get(i).get(count+1);
                        int z = y-x;
                        if(z <= 3 && z > 0){
                            count++;
                        }
                        else{
                            sum--;
                            break;
                        }
                    }
                }
            }
            else{
                sum--;
            }
        }
        System.out.println(sum);
    }
}
