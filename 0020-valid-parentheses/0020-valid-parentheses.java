class Solution {
    public boolean isValid(String s) {
        Stack<Character> sp = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                sp.push(c);
            }
            // If the character is a closing bracket, check if it matches the top of the stack
            else if (c == ')' && !sp.isEmpty() && sp.peek() == '(') {
                sp.pop();
            } 
            else if (c == '}' && !sp.isEmpty() && sp.peek() == '{') {
                sp.pop();
            } 
            else if (c == ']' && !sp.isEmpty() && sp.peek() == '[') {
                sp.pop();
            } 
            else {
                // If any of the conditions fail, return false
                return false;
            }
        }
            return  sp.isEmpty();
        
    }
}