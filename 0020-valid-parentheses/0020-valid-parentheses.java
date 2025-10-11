class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(')');
            }else if(s.charAt(i)=='{'){
                stack.push('}');
            }
            else if(s.charAt(i)=='['){
                 stack.push(']');
            }else{
                if(!stack.isEmpty()){
                    if(s.charAt(i)==stack.peek()){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }else{
                    return false;
                }
                
            }
        }
            return stack.isEmpty();
     } 
    
}