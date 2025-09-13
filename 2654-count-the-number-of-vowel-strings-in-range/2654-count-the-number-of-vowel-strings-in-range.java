class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for (int i = 0; i < words.length; i++) {
            String demo = words[i];
            int r = demo.length();

            if ((demo.charAt(0) == 'a' || demo.charAt(0) == 'e' || demo.charAt(0) == 'i' 
                 || demo.charAt(0) == 'o' || demo.charAt(0) == 'u') &&
                (demo.charAt(r - 1) == 'a' || demo.charAt(r - 1) == 'e' || demo.charAt(r - 1) == 'i' 
                 || demo.charAt(r - 1) == 'o' || demo.charAt(r - 1) == 'u') && i>=left && i<=right) {

               count++;
            }
        }
        return count;
    }
}
