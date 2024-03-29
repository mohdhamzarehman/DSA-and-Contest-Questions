import java.util.*;

/**
 * https://codeforces.com/problemset/problem/69/A
 */
public class Codeforces16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;
        while (n-- >= 1) {
            x = x + sc.nextInt();
            y = y + sc.nextInt();
            z = z + sc.nextInt();
        }
        if (x == 0 && y == 0 && z == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
