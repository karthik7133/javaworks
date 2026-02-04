package practise;
import java.util.*;
public class segevenodd {
	static node head=null,p=null,ep=null,op=null;
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		int n=x.nextInt();
		for(int i=0;i<n;i++)insert(x.nextInt());
		seg();
	}
	static void seg() {
		node e=null,o=null;
		node t=head;
		while(t!=null) {
			node n= new node(t.data);
			if(t.data%2==0) {
				if(e==null) {
					e=ep=n;
				}
				ep.next=n;
				ep=n;
			}else {
				if(o==null) {
					o=op=n;
				}
				op.next=n;
				op=n;
			}
			t=t.next;
		}
		display(e);display(o);
	}
	static void insert(int d) {
		node newd=new node(d);
		if(head==null) {
			head=p=newd;return;
		}
		p.next=newd;
		p=newd;
	}
	static void display(node h) {
		node t=h;
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
