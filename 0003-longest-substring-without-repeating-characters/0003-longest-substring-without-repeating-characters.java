class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> seen = new ArrayList<>();
        int maxLen=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            if(!seen.contains(s.charAt(j))){
                seen.add(s.charAt(j));
                maxLen=Math.max(maxLen,j-i+1);
                j++;
            }else{
                seen.remove((Character) s.charAt(i)); // ✅ Correct: cast to Character, and remove from left

                i++;
            }
        }
        return maxLen;
    }
}