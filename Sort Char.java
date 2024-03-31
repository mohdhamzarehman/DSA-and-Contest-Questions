class Solution {
    public String frequencySort(String s) {
        // Step 1: Count the frequency of each character
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c: s.toCharArray()) map.put(c, map.getOrDefault(c,0)+1);
        
        // Step 2: Create buckets based on the frequency
        List<Character>[] bucket = new ArrayList[s.length()+1];
        for(Character c: map.keySet()){
            if(bucket[map.get(c)]==null)
                bucket[map.get(c)]= new ArrayList<>();       
            bucket[map.get(c)].add(c);
        }

        // Step 3: Iterate through the buckets and build the result
        StringBuilder result = new StringBuilder();
        for(int i= bucket.length-1; i>=0; i--){
            if(bucket[i]!=null){
                for(Character c: bucket[i])
                    for(int j=0; j<i; j++) 
                        result.append(c);
            }
        } 
        return result.toString();   
    }
}
