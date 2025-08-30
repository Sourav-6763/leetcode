public class Solution {
    private static final int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static final String[] numerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public static String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
         int i = 0;
        while (num > 0) {
            while (num >= values[i]) {
                res.append(numerals[i]);
                num -= values[i];
            }
            i++;
        }
        return res.toString();
    }
}
