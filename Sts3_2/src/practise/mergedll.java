package practise;

import java.util.Scanner;

public class mergedll {
	static node head=null,p=null;
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		for(int i=0;i<n;i++)insert(x.nextInt());
		head=mergesort(head);
		display();
	}
	static node mergesort(node h) {
		if(h==null || h.next==null)return h;
		node second=split(h);
		h=mergesort(h);
		second=mergesort(second);
		return merge(h,second);
		
	}
	static node merge(node h,node s) {
		if(h==null )return s ;
		if(s==null)return h;
		if(h.data<s.data) {
			h.next=merge(h.next,s);
			if(h.next!=null)h.next.prev=h;
			h.prev=null;
			return h;
		}else {
			s.next=merge(h,s.next);
			if(s.next!=null)s.next.prev=s;
			s.prev=null;
			return s;
		}
	}
	static node split(node h) {
		node f=h,s=h;
		while(f.next!=null && f.next.next!=null) {
			f=f.next.next;
			s=s.next;
		}
		node second=s.next;
		s.next=null;
		if(second!=null)second.prev=null;
		return second;
	}
	static void insert(int d) {
		node n=new node(d);
		if(head==null) {
			head=p=n;return;
		}
		p.next=n;
		n.prev=p;
		p=n;
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
//	int data;
//	node prev,next;
//	node(int data){
//		this.data=data;
//		prev=null;
//		next=null;
//	}
//}

