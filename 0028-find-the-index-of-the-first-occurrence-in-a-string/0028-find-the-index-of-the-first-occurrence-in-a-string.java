class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i; // Found the needle
            }
        }
        return -1;
    }
}
