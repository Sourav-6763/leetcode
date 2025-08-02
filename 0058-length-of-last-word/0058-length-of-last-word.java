class Solution {
    public int lengthOfLastWord(String s) {
        String ss = s.trim();
        String[] word = ss.split(" ");
        String res=word[word.length-1];
        return res.length();
    }
}