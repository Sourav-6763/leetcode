class Solution {
    public boolean isPalindrome(int x) {
        int real=x;
        int revNum = 0;
        if (x>0){
            while (x > 0) {
                revNum = revNum * 10 + x % 10;
                x = x / 10;
            }

        }
        System.out.println(revNum);
        if(revNum==real){
            return true;
        }
        else{
            return false;
        }
        
    }
}