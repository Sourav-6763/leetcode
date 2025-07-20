class Solution {
    public boolean isValid(String s) {
        Stack<Character> ab = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                ab.push(')');
            }
            else if (s.charAt(i) == '{') {
                ab.push('}');
            }
            else if (s.charAt(i) == '[') {
                ab.push(']');
            } else {
                if (!ab.isEmpty()) {
                    char val = ab.peek();
                    if (val == s.charAt(i)) {
                        ab.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }

            }
        }
        return ab.isEmpty();

    }
}