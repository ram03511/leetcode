class MinStack {
    ArrayDeque<Integer> st;
    ArrayDeque<Integer> mnst;
    public MinStack() {
        this.st = new ArrayDeque<>();
        this.mnst = new ArrayDeque<>();
    }
    public void push(int value) {
        st.push(value);
        if(mnst.isEmpty()){
            mnst.push(value);
        }
        else{
            mnst.push(Math.min(value,mnst.peek()));
        }
    } 
    public void pop() {
        st.pop();
        mnst.pop();
    }
    public int top() {
        return st.peek();
    }
    public int getMin() {
        return mnst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */