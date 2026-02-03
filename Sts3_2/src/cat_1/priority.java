package cat_1;
import java.util.*;
public class priority {
	static Node head=null,tail=null;
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		for(int i=0;i<4;i++)insert(x.nextInt(),x.nextInt());
		display();
	}
	static void insert(int pq,int d) {
		Node newd =new Node(pq,d);
		if(head==null) {
			head=newd;
			tail=newd;
			return;
		}
		Node t=head;
		while(t!=null && t.p<=pq) {
			t=t.next;
		}
		if(t==head) {
			head.prev=newd;
			newd.next=head;
			head=newd;return;
		}
		if(t==null) {
			tail.next=newd;
			newd.prev=tail;
			tail=newd;return;
		}
		else {
			Node temp=t.prev;
			temp.next=newd;
			newd.prev=temp;
			newd.next=t;
			t.prev=newd;return;
		}
	}
	static void display() {
		Node t=head;
		while(t.next!=null) {
			System.out.print(t.d+"->");
			t=t.next;
		}System.out.println(t.d);
	}
}
class Node{
	int p,d;
	Node prev,next;
	Node(int p,int d){
		this.p=p;
		this.d=d;
		this.prev=null;
		this.next=null;
	}
}
