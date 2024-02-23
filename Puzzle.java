import java.util.*;

public class Codeforces17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // ip no of students
        int m = scanner.nextInt(); // ip no of puzzles
        Integer[] f = new Integer[m]; // store m in f array
        for (int i = 0; i < m; i++)
            f[i] = scanner.nextInt(); //ip array of size of puzzles storing

        Arrays.sort(f); // sorting

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= m - n; i++) {
            ans = Math.min(ans, f[i + n - 1] - f[i]); //calcs the difference (min)
        }

        System.out.println(ans); //prints the min diff
    }
}
