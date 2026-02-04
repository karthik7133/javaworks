package practise;

import java.util.Scanner;

public class loop {
	static node head=null,p=null;
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		for(int i=0;i<n;i++)insert(x.nextInt());
		//create(3);
		System.out.println(detect());
	}
	static void insert(int d) {
		node newd=new node(d);
		if(head==null) {
			head=p=newd;return;
		}
		p.next=newd;
		p=newd;
	}
	static boolean detect() {
		node f=head,s=head;
		while(f.next!=null && f.next.next!=null) {
			f=f.next.next;
			s=s.next;
			if(f==s)return true;
		}return false;
	}
	static void create(int g) {
		node t=head;
		while(g-- >0) {
			t=t.next;
		}
		p.next=t;
	}
	
	static void display() {
		node t=head;
		while(t.next!=null) {
			System.out.print(t.data+"->");
			t=t.next;
		}System.out.println(t.data);
	}
}
//class node{
//	int data;node next;
//	node(int d){
//		data=d;
//		next=null;
//	}
//}
