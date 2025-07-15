class MyQueue {
  private Stack<Integer> stackIn;
  private Stack<Integer> stackOut;
    public MyQueue() {
        stackIn =new Stack<>();
        stackOut =new Stack<>();
    }
    public void push(int x) {
        stackIn.push(x);
    }
    
    public int pop() {
        Shifted();
       return  stackOut.pop();
    }
    
    public int peek() {
        Shifted();
        return stackOut.peek();
    }
    
    public boolean empty() {
        if(stackIn.isEmpty() && stackOut.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public void Shifted(){
        if(stackOut.isEmpty()){
            while(!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */