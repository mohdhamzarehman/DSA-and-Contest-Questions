import java.util.*;
class Solution {
  //https://leetcode.com/problems/distribute-candies/
    public int distributeCandies(int[] candyType) {
        Set<Integer> hs = new HashSet<>(); //create a hashset
        for( int n : candyType){ //iterate 
            hs.add(n); //add elements of candytype to hashset
        }
        int n= candyType.length/2; 
        if(n>=hs.size()){ //if  n bada hai hashset se
            return hs.size(); //hashset ka size return
        }
        else{
            return n; //warna return n
        }
    }
}
