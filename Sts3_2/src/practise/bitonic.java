package practise;
import java.util.*;
public class bitonic {
	static node head=null,p=null;
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		for(int i=0;i<n;i++)insert(x.nextInt());
		head=merge(head,reverse(split()));
		display();
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
	static node merge(node f,node s) {
		if(f==null)return s;
		if(s==null)return f;
		if(f.data<s.data) {
			f.next=merge(f.next,s);
			if(f.next!=null)f.next.prev=f;
			f.prev=null;
			return f;
		}else {
			s.next=merge(f,s.next);
			if(s.next!=null)s.next.prev=s;
			s.prev=null;
			return s;
		}
	}
	static node reverse(node s) {
		node t =s;
		node temp=null;
		while(t!=null) {
			 temp=t.prev;
			 t.prev=t.next;
			 t.next=temp;
			 t=t.prev;
		}if(temp!=null) {
			s=temp.prev;
		}
		return s;
	}
	static node split() {
		node t =head;
		while(t.data<t.next.data) {
			t=t.next;
		}
		node second=t.next;
		t.next=null;
		if(second!=null)second.prev=null;
		return second;
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
//		prev=null;
//	}
//}
