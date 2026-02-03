package cat_1;

import java.util.*;
public class dllmerge {
	static Node head=null;
	static Node p=null;
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		Node newd=new Node(x.nextInt());
		head=newd;
		p=head;
		for(int i =1;i<n;i++) {
			insert(x.nextInt());
		}
		display();
	}
	static void insert(int data) {
		Node newd= new Node(data);
		p.next=newd;
		newd.prev=p;
		p=p.next;
		
	}
	static Node merge(Node first,Node second) {
		if(first==null)return second;
		if(second==null)return first;
		if(first.data<second.data) {
			first.next=merge(first.next,second);
			first.next.prev=first;
			first.prev=null;
			return first;
		}
		else {
			second.next=merge(first,second.next);
			second.next.prev=second;
			second.prev=null;
			return second;
		}
	}
	static Node mergesort(Node head) {
		if(head==null |head.next==null) {
			return head;
		}
		Node second=split(head);
		head=mergesort(head);
		second=mergesort(second);
		return merge(head,second);
	}
	static Node split(Node head) {
		Node slow=null;
		Node fast=null;
		
		while(fast.next!=null |fast.next.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		Node second=slow.next;
		slow.next=null;
		if(second!=null) {
			second.prev=null;
		}return second;
	}
	static void display() {
		Node t=head;
		while(t.next!=null) {
			System.out.print(t.data+"->");
			t=t.next;
		}System.out.println(t.data);
	}
	
}
//class Node{
//	int data;
//	Node next;
//	Node prev;
//	Node(int data){
//		this.data=data;
//		next=prev=null;
//	}
//}
