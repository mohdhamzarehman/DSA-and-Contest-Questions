import java.util.*;

/*
 * You are playing a solitaire game with three piles of stones of sizes a, b, and c respectively. Each turn you choose two different non-empty piles, 
 take one stone from each, and add 1 point to your score. The game stops when there are fewer than two non-empty piles (meaning there are no more available moves). Given three integers a, b, and c,
 return the maximum score you can get.
 */
public class Solitaire {
    public static void main(String[] args) {
        int a = 1;
        int b = 8;
        int c = 8;
        int maxScore = getmaxScore(a, b, c); // variable for storing
        System.out.println("Max Score is " + maxScore);
    }

    // function to get the max score out of the three piles
    public static int getmaxScore(int a, int b, int c) {
        int[] piles = { a, b, c }; // array to store each piles
        Arrays.sort(piles); // sort the piles in ascending order
        int score = 0; // size = 0
        while (piles[1] > 0 || piles[2] > 0) { // while two of them are't 0
            piles[2]--; // decrease piles & increase score simultaneously
            piles[1]--; // ""

            score++;
            Arrays.sort(piles); // sort piles in the end
        }
        return score;
    }
}
