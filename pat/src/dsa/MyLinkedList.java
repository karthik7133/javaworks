package dsa;



class MyLinkedList {
	public static void main(String[] args) {
		MyLinkedList l=new MyLinkedList();
		l.addAtHead(10);
		l.addAtTail(20);
		l.addAtIndex(1, 7);
		System.out.println(l.get(2));
		l.print();
	}
	
    
    private class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int size;
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void print() {
    	Node t=head;
    	while(t.next!=null) {
    		System.out.print(t.val+"->");
    		t=t.next;
    	}System.out.println(t.val);
    }
    
   
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }
    
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    
   
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
   
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index <= 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }

        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        
        Node newNode = new Node(val);
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }
    
  
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
            if (head == null) tail = null;
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            
            prev.next = prev.next.next;
            if (index == size - 1) {
                tail = prev;
            }
        }
        size--;
    }
}
