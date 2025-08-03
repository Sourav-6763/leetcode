class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if(m==1)return 0;
        if (m < n)
            return -1;
        for (int i = 0; i <= m - n; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                String a = haystack.substring(i, i + n);
                if (a.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}