package practise;

import java.util.Scanner;

public class priority {
	static node head=null,p=null;
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		for(int i=0;i<n;i++)insert(x.nextInt(),x.nextInt());
		display();
	}
	static void insert(int a,int b) {
		node n=new node(a,b);
		if(head==null) {
			head=p=n;return;
		}
		node t=head;
		while(t!=null && t.pri<=a) {
			t=t.next;
		}
		if(t==head) {
			n.next=head;
			head.prev=n;
			head=n;return;
		}
		if(t==null) {
			p.next=n;
			n.prev=p;
			p=n;return;
		}
		else {
			node temp=t.prev;
			t.prev=n;
			n.next=t;
			n.prev=temp;
			temp.next=n;
			return;
		}
	}
	static void display() {
		node t=head;
		while(t.next!=null) {
			System.out.print(t.data+"->");
			t=t.next;
		}
		System.out.println(t.data);
	}
	
}
class node{
	int data,pri;
	node prev,next;
	node(int pri,int data){
		this.pri=pri;
		this.data=data;
		prev=null;
		next=null;
	}
}
