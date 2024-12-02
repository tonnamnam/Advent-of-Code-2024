import java.util.*;

public class Day1_2 {

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
        sc.close();
    }

    // public static void cal() {
    //     input();
    //     for (int i = 0; i < a.size(); i++) {
    //         int x = 0;
    //         for (int j = 0; j < b.size(); j++) {
    //             if (a.get(i) == b.get(j)) {
    //                 x++;
    //             }
    //         }
    //         c.add(a.get(i)*x);
    //     }
    //     int y = 0;
    //     for (int i = 0; i < c.size(); i++) {
    //         y = y+c.get(i);
    //     }
    //     System.out.println(y);
    // }

    public static void cal() {
        input();
        for (int x : a) {
            int count = 0;
            for (int y : b) {
                if (x == y){
                    count++;
                }
            }
            c.add(x*count);
        }
        int sum = 0;
        for (int x : c) {
            sum = sum + x;
        }
        System.out.println(sum);
    }
}