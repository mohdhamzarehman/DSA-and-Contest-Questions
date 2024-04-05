class Solution {
    public int characterReplacement(String s, int k) {
        int[] charCount=new int[26];
        int start=0;
        int end=0;
        int tempmax=0;
        int max=0;
        while(end<s.length()){
          
            tempmax=Math.max(tempmax,++charCount[s.charAt(end)-'A']);
            
           
            while(end-start+1-tempmax-k>0){
                
                charCount[s.charAt(start)-'A']--;
                start++;
            }
        
            max=Math.max(max,end-start+1);
                end++;

        }
        return max;
    }
}
