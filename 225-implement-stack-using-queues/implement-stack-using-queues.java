class MyStack {
    Queue <Integer> original , temp ;
    public MyStack() {
        original = new LinkedList<>();
        temp = new LinkedList<>();
    }
    
    public void push(int x) {
        original.offer(x);
    }
    
    public int pop() {
        while(original.size()!=1){
            temp.offer(original.poll());
        }
        int ans = original.poll();
        var temp1 = original ;
        original = temp ;
        temp = temp1;
        return ans;
    }
    
    public int top() {
        while(original.size()!=1){
            temp.offer(original.poll());
        }
        int ans = original.peek();
        temp.offer(original.poll());
        var temp1 = original ;
        original = temp ;
        temp = temp1;
        return ans;
    }
    
    public boolean empty() {
        return original.isEmpty();     
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */