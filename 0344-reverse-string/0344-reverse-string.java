class Solution {
    public void reverseString(char[] s) {
        List<Character> charList = new ArrayList<>();
        for(int i=s.length-1;i>=0;i--){
            charList.add(s[i]);
            
        }
       char[] charArray = new char[charList.size()];
       for (int i = 0; i < charList.size(); i++) {
            s[i] = charList.get(i);
        }
        return ;
    }
}