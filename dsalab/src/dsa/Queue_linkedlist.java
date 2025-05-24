package dsa;

public class Queue_linkedlist {
	public static void main(String[] args) {
		Queue k= new Queue();
		k.push(3);
		k.push(7);
		k.push(37);
		k.display();
		k.pop();
		k.display();
	}
}

class Queue{
	private Node front,rear;
	Queue(){
		this.front=null;
		this.rear=null; 
	}
	void push(int a) {
		Node newnode = new Node(a);
		  if (this.rear == null) {
	            this.front = this.rear = newnode;
	        }
		  rear.next=newnode;
		rear=newnode;
		System.out.println("The pushed element is :"+a);
	}
	void pop() {
		if(this.front==null) {
			System.out.println("Que is empty!");
		}else {
			Node temp=this.front;
			this.front =this.front.next;
			System.out.println("Poped element is :"+temp.data);
		}if(this.front==null) {
			this.rear=null;
		}
	}
	void display() {
		if(this.front==null) {
			System.out.println("The queue is empty!");
		}
		Node currentnode = front;
        while (currentnode != null) {
        	if(currentnode.next==null) {
        		System.out.println(currentnode.data+"-->null");
        	}else {
            System.out.print(currentnode.data + "-->");}
            currentnode= currentnode.next;
        }
        System.out.println();
	}
}
