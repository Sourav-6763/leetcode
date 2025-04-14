class Solution {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        int count = 0;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 9) {
                count++;
            }
        }

        if (digits[index] == 9 && count != digits.length) {
            for (int i = index; i >= 0; i--) {
                if (digits[i] != 9) {
                    int dig = digits[i];
                    int p = dig + 1;
                    digits[i] = p;
                    return digits;
                } else if (digits[i] == 9) {
                    digits[i] = 0;
                }

            }
        }
        if (digits[index] == 9 && count == digits.length) {
            int[] digitnew = new int[digits.length + 1];
            for (int i = digitnew.length - 1; i >= 0; i--) {
                if (i == 0) {
                    digitnew[i] = 1;
                } else {
                    digitnew[i] = 0;
                }

            }
            return digitnew;

        } else {
            int a = digits[index];
            int res = a + 1;
            digits[index] = res;
            return digits;
        }
      
    }
}