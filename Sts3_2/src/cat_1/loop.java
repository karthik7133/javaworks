package cat_1;
import java.util.*;
public class loop {
	static node head=null;
	static node p=null;
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n =x.nextInt();
		node newd= new node(x.nextInt());
		head=newd;
		p=head;
		for(int i=1;i<n;i++)insert(x.nextInt());
		display();
	}
	static void insert(int d) {
		node newd=new node(d);
		p.next=newd;
		p=p.next;
	}
	static void display() {
		node temp=head;
		while(temp.next!=null) {
			System.out.println(temp.data+"->");
		}System.out.print(temp.data);
	}
}
class node{
	int data;node next;
	node(int d){
		data=d;
		this.next=null;
	}
}
