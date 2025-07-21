class Solution {
    public String reverseWords(String s) {
        String [] word=s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(word));
        return String.join(" ", word);
    }
}