public class Solution {
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
       for(int i=0;i<values.length;i++){
        while(num>=values[i]){
             num-=values[i];
             res.append(numerals[i]);
        }
       }
       return res.toString();
    }

}  
