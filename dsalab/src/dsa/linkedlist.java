package dsa;
import java.util.*;
public class linkedlist {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(5);
		s.push(6);
		s.push(8);
		s.pop();
		s.pop();
		s.display();
	}
}
class Node5{
	int data;
	Node5 next;
	Node5(int a){
		this.data=a;
		this.next=null;
	}
}
class Stack{
	private Node5 top;
	Stack(){
		this.top=null;
	}
	void push(int a) {
		Node5 newNode=new  Node5(a);
		newNode.next=top;
		top=newNode;
		System.out.println("The pushed element is :"+a);
	}
	void pop() {
		if(top==null) {
			System.out.println("stack is empty!");
		}else {
			System.out.println("the poped element is :"+top.data);
			top=top.next;
		}
	}void display(){
		if(top==null) {
			System.out.println("stack is empty!");
		}else {
			while(top!=null) {
				System.out.println(top.data);
				top=top.next;
			}
		}
	}
}

