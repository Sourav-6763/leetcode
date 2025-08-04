class Solution {
    public boolean isPalindrome(String s) {
        String clean=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int right=clean.length()-1;
        int left=0;
        System.out.println(clean);
        while(left<right){
            if(clean.charAt(right)!=clean.charAt(left)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}