class MyQueue {
    Stack <Integer> original,temp;
    public MyQueue() {
        original = new Stack<>();
        temp  = new Stack<>();
    }
    public void push(int x) {
        original.push(x);
    }
    public int pop() {
        while(original.size()!=1){
            temp.push(original.pop());
        }
        int ans = original.pop();
        while(!temp.isEmpty()){
            original.push(temp.pop());
        }
        return ans;
    } 
    public int peek() {
        while(original.size()!=1){
            temp.push(original.pop());
        }
        int ans = original.peek();
        while(!temp.isEmpty()){
            original.push(temp.pop());
        }
        return ans;
    }
    public boolean empty() {
        return original.isEmpty();
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