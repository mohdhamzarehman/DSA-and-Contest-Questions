class Solution {
    public String getHint(String secret, String guess) {
        if (secret == null || guess == null || secret.length() == 0 || guess.length() == 0) {
            return "0A0B";
        }
        
        char[] secretArr = secret.toCharArray();
        char[] guessArr = guess.toCharArray();
        
        Map<Character, Integer> secretMap = new HashMap<>();
        Map<Character, Integer> guessMap = new HashMap<>();
        
        // count matches
        int bulls = 0;
        for (int i = 0; i < secretArr.length; i++) {
            char a = secretArr[i], b = guessArr[i];
            if (a == b) {
                bulls++;
            } else {
                secretMap.putIfAbsent(a, 0);
                secretMap.put(a, secretMap.get(a) + 1);
                guessMap.putIfAbsent(b, 0);
                guessMap.put(b, guessMap.get(b) + 1);
            }
        }
        
        // count miss positioned chars
        int cows = 0;
        for (Map.Entry<Character, Integer> entry : secretMap.entrySet()) {
            char key = entry.getKey();
            if (guessMap.containsKey(key)) {
                cows += Math.min(entry.getValue(), guessMap.get(key));
            }
        }

        return String.format("%sA%sB", bulls, cows);
    }
}
