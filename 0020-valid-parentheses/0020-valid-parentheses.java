class Solution {
    public boolean isValid(String s) {
        Stack<Character> ab = new Stack<>();
        if (s.length() <= 1)
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                ab.push(')');
            } else if (s.charAt(i) == '{') {
                ab.push('}');
            } else if (s.charAt(i) == '[') {
                ab.push(']');
            } else {
                if(!ab.isEmpty()){
                    if(ab.peek()==s.charAt(i)){
                        ab.pop();
                    }else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        return ab.isEmpty();
    }
}