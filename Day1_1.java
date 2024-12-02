import java.util.*;

public class Day1_1 {

    static ArrayList<Integer> a = new ArrayList<>();
    static ArrayList<Integer> b = new ArrayList<>();
    static ArrayList<Integer> c = new ArrayList<>();

    public static void main(String[] args) {
        cal();
    }

    public static void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == -1 || y == -1) {
                break;
            }
            a.add(x);
            b.add(y);
        }
        Collections.sort(a);
        Collections.sort(b);
        sc.close();
    }

    public static void cal() {
        input();
        int x = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i)>b.get(i)){
                c.add(a.get(i)-b.get(i));
            }
            else if(a.get(i)<b.get(i)){
                c.add(b.get(i)-a.get(i));
            }
            else{
                c.add(a.get(i)-b.get(i));
            }
            x = x+c.get(i);
        }
        System.out.println("x = "+x);
    }
}
