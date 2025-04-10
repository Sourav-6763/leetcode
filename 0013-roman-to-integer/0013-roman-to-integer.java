class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int total = 0;
        Character previous = '\0';
        Character current = '\0';

        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            if (i < s.length() - 1) {
                previous = s.charAt(i + 1);

            }
            if (s.length() > 1) {
                if (romanMap.get(current) >= romanMap.get(previous)) {
                    total = total + romanMap.get(current);
                } else {
                    total = total - romanMap.get(current);
                }
            }else{
                total=romanMap.get(current);
            }
        }
        return total;
    }
}