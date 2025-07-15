class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> word1 = new HashMap<>();
        Map<String, Integer> word2 = new HashMap<>();

        for (String i : words1) {
            if (word1.containsKey(i)) {
                int val = word1.get(i);
                word1.put(i, val + 1);
            } else {
                word1.put(i, 1);
            }
        }

         for (String i : words2) {
            if (word2.containsKey(i)) {
                int val = word2.get(i);
                word2.put(i, val + 1);
            } else {
                word2.put(i, 1);
            }
        }
        int count=0;
        for(String x:word1.keySet()){
            if(word2.containsKey(x) && word2.get(x)==1 && word1.get(x)==1){
                count++;
            }
        }
        return count;
    }
}