class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> v = new HashMap<>();
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < s.length(); i++) {
            if (v.containsKey(s.charAt(i))) {
                int val = v.get(s.charAt(i));
                v.put(s.charAt(i), val + 1);
            } else {
                v.put(s.charAt(i), 1);
            }
        }
        for (Character ch : v.keySet()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel = Math.max(vowel, v.get(ch));
            } else {
                consonant = Math.max(consonant, v.get(ch));
            }
        }
        return vowel+consonant;
    }
}