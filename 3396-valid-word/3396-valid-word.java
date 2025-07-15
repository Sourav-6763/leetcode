class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3)
            return false;
        int characters = 0;
        int digit = 0;
        int upLetter = 0;
        int lowerLetter = 0;
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            if (Character.isUpperCase(x)) {
                upLetter++;
            }
            if (!Character.isLetterOrDigit(x)) {
                return false; 
            }
            if (Character.isLowerCase(x)) {
                lowerLetter++;
            }
            if (Character.isDigit(x)) {
                digit++;
            }
            if(Character.isLetter(x)){
            char ch = Character.toLowerCase(x);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }else{
                consonant++;
            }
        }
        }
        if(((upLetter>0) || (lowerLetter>0) || (digit>0)) &&(vowel>0) &&(consonant>0)){
            return true;
        }
        return false;
    }
}