import java.util.*;
/**
 * <a href="https://codeforces.com/problemset/problem/443/A"/>
 */
public class Codeforces18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace("{","");
        s = s.replace("}","");
        s = s.replaceAll(", ","");
        s = s.trim();
        Set<Character> characterSet = new LinkedHashSet<>();
        for(int i = 0; i < s.length(); i++){
            characterSet.add(s.charAt(i));
        }
        System.out.println(characterSet.size());
    }
}
