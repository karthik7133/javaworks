package cat_1;
import java.util.*;
import cat_1.practise;
public class seg_even_odd {
	static node head=null;
	static node p,f,s=null;
	static node first,second=null;
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		node newd= new node(x.nextInt());
		head=newd;
		p=head;
		for(int i=1;i<n;i++)insert(x.nextInt());
		display(head);
		display(first);
		display(second);
	}
	static void cnode(node head) {
		node temp;
		temp=head;
		while(temp!=null) {
			insertn(temp.data);
			temp=temp.next;
		}
	}
	public static void insert(int d){
        node newd= new node(d);
        p.next=newd;
        p=p.next;
    }
	static void insertn(int data) {
		node newd=new node(data);
		if(data%2==0) {
			if(f==null) {
				first=newd;f=first;return;
			}
			f.next=newd;
			f=f.next;
		}else {
			if(second==null) {
				second=newd;f=second;return;
			}
			s.next=newd;
			s=s.next;
		}
	}
	public static void display(node h){
        node t=h;
        while(t.next!=null){
            System.out.print(t.data+"->");
            t=t.next;
        }
        System.out.println(t.data);
    }
}
//class node{
//	int data;node next;
//	node(int data){
//		this.data=data;
//		this.next=null;
//	}
//}
