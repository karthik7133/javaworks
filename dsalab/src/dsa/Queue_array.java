package dsa;

public class Queue_array {
	public static void main(String[] args) {
		array a=new array(5);
		a.push(25);
		a.push(26);
		a.push(7);
		a.push(9);
		a.pop();
		a.pop();
		a.pop();
		
		
		a.display();
	}
}
class array{
	int rear;
	int size;
	int a[];
	int front;
	array(int s){
		size = s;
		rear=front=0;
		this.a=new int[size];
	}
	void push(int e) {
		if(rear!=size) {
		
		a[rear]=e;
		rear++;
		System.out.println("Element "+e+" Is added!");}
		else {
			System.out.println("stack is full!");
		}
	}
	void pop() {
		if(rear!=0) {
			
			System.out.println("Deleted element is :"+a[front]);
			front++;
		}else {
			System.out.println("Stack is empty!");
		}
	}
	void display() {
		if(rear!=0) {
			for(int i=front;i<rear;i++) {
				System.out.println(a[i]);
			}
		}else {
			System.out.println("Stack is empty!");
		}
	}
}
