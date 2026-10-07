class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class MyLinkedList {
    int size = 0;
    Node head;

    public MyLinkedList() {

    }

    public int get(int index) {
        if (index >= size || index < 0) {
            return -1;
        }
        Node temp = head;
        int i = 0;
        while (i < index) {
            temp = temp.next;
            i++;
        }
        return temp.val;
    }
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
        return;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
        return;
    }

    public void addAtIndex(int index, int val) {
        if (index > size || index < 0) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        
        Node temp = head;
        int i = 0;
        while (i < index-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return;

    }

    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) {
            return;
        }
        if(index == 0){
            head = head.next;
            size--; 
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < index -1 && i < size) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
        return;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */