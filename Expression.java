import java.util.*;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //input all the integers
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans1 = a + b * c;// calculating all the possible combinations as per the problem and storing them in another variable
        int ans2 = a * (b + c);
        int ans3 = a * b * c;
        int ans4 = (a + b) * c;
        int ans5 = a + b + c;
        int ans = Math.max(Math.max(Math.max(Math.max(ans1, ans2), ans3), ans4), ans5); //comparing the max of the variables
        System.out.println(ans); //printing the max
    }
}
