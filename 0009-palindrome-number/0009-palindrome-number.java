class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        String ab = Integer.toString(x);
        int left = 0;
        int right = ab.length() - 1;
        while (left < right) {
            if (ab.charAt(left) != ab.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}