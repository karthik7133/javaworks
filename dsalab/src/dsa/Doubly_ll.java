package dsa;
import java.util.*;
public class Doubly_ll {
	Node head,tail;
	Doubly_ll(){
		head=tail=null;
	}
	public static void main(String[] args) {
		Doubly_ll l=new Doubly_ll();
		l.addfirst(2);
		l.addfirst(3);
		l.addfirst(7);
		l.addlast(19);
		l.display();
		l.delback();
		l.deletionfront();
		l.display();
		l.addatkeypos(234, 3);
		l.delatkey(234);
		l.display();
	}
	void addfirst(int a) {
		Node n= new Node(a);
		if(head==null) {
			head=tail=n;
		}n.next=head;
		head.prev=n;
		head=n;
	}
	void addlast(int a) {
		Node n=new Node(a);
		if(head==null) {
			head=tail=n;
		}tail.next=n;
		n.prev=tail;
		tail=n;
	}
	void addatkeypos(int a,int b) {
		Node n=new Node(a);
			Node temp=head;
			while(temp.next!=null) {
			if(temp.data==b) {
			Node nextNode = temp.next;
			temp.next=n;
			n.next=nextNode;
			System.out.println("The element is inserted after key !");
			break;
			}else {
				temp=temp.next;
			}
		} 
		
	}
	void deletionfront() {
		if(head==null) {
			System.out.println("Llist is empty!");
		}if (head==tail){
			head=tail=null;
		}else {
			head=head.next;
			head.prev=null;
		}
	}void delback(){
		if(head==null) {
			System.out.println("llist is empty!");
		}if(head==tail) {
			head=tail=null;
		}else {
			tail=tail.prev;
			tail.next=null;
		}
	}void delatkey(int a){
		Node temp=head;
		while(temp.next!=null) {
			if(temp.next.data==a) {
				Node nextnode=temp.next;
				temp.next=nextnode.next;
				temp=temp.next;
			}else {
				System.out.println("Key not found !");
			}
		}
	}
	void display(){
		Node currentnode = head;
		while(currentnode!=null) {
			if(currentnode.next==null) {
				System.out.println(currentnode.data+"-->null");
			}else {
			System.out.print(currentnode.data+"-->");}
			currentnode=currentnode.next;
		}System.out.println("\n");
	}
}
class Node {
	int data;
	Node prev;
	Node next;
	Node(int a){
		data=a;
		prev=next=null;
	}
}
