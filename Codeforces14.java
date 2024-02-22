import java.util.*;

/**
 * <a href =https://codeforces.com/problemset/problem/208/A"/>
 */
public class Codeforces14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String remixsong = sc.next();
        remixsong = remixsong.replaceAll("(WUB)+", " ");
        remixsong = remixsong.trim();
        System.out.println(remixsong);
    }
}