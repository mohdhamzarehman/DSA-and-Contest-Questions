import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        // calculate cumsum
        ArrayList<Integer> cumArr = new ArrayList<Integer>();
        cumArr.add(arr.get(0));
        for (int i = 1; i < n; i++) {
            cumArr.add(cumArr.get(i - 1) + arr.get(i));
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            if (start == 0) {
                System.out.println(cumArr.get(end));
            } else {
                System.out.println(cumArr.get(end) - cumArr.get(start - 1));
            }
        }
    }
}
