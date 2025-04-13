class Solution {
    public int reverse(int x) {
        int n = Math.abs(x);
        int rev = 0;
        while (n > 0) {
            int a = n % 10;
            
            n = n / 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && a > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && a < -8))
                return 0;
                rev = rev * 10 + a;
        }
        if (x < 0) {
            int negative = -rev;
            return negative;
        }
        return rev;
    }
}