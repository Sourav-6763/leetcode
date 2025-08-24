class MyQueue {
    Stack<Integer> stackIn=new Stack<>();
    Stack<Integer> stackout=new Stack<>();
    public MyQueue() {
        stackIn=new Stack<>();
        stackout=new Stack<>();

    }
    
    public void push(int x) {
        stackIn.push(x);
    }
    
    public int pop(){
        if(stackout.isEmpty()){
            while(!stackIn.isEmpty()){
                stackout.push(stackIn.pop());
            }
        }
        return stackout.pop();
    }
    
    public int peek() {
        if(stackout.isEmpty()){
            while(!stackIn.isEmpty()){
                stackout.push(stackIn.pop());
            }
        }
        return stackout.peek();
    }
    
    public boolean empty() {
        return stackIn.isEmpty() && stackout.isEmpty();
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