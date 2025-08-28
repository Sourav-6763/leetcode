class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> ab=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(ab.contains(s.charAt(i))){
                return s.charAt(i);
            }
            else{
                ab.add(s.charAt(i));
            }
        }
        return '\0';
    }
}