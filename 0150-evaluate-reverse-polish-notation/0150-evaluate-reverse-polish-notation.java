class Solution {
    public int evalRPN(String[] tokens){
        Stack<Integer> ab=new Stack<>();
        for(String i:tokens){
            if(i.matches("-?\\d+")){
               ab.push(Integer.parseInt(i));
            }
            else{
                int val=ab.pop();
                int val2=ab.pop();
                if(i.equals("+")){
                   ab.push(val+val2);
                }
                 else if(i.equals("*")){
                   ab.push(val*val2);
                }
                else  if(i.equals("/")){
                   ab.push(val2/val);
                }
                else if(i.equals("-")){
                   ab.push(val2-val);
                }
                
            }
        }
        return ab.peek();
    }
}