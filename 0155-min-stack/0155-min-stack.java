class MinStack {
    private Stack<Integer> ab;
    private Stack<Integer>min;

    public MinStack() {
        ab = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        ab.push(val);
        if (min.isEmpty()||min.peek()>=val) {
            min.push(val);
        } else {
            min.push(min.peek());
        }
    }

    public void pop() {
        if (!ab.isEmpty()) {
            ab.pop();
            min.pop();
        }

    }

    public int top() {
        if (!ab.isEmpty()) {
            return ab.peek();
        }return -1;
    }

    public int getMin() {
        if (!min.isEmpty()) {
            return min.peek();
        }
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */