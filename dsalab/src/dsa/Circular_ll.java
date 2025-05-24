package dsa;

public class Circular_ll {
	Node4 head,tail;
	Circular_ll(){
		head=tail=null;
	}public static void main(String[] args) {
		Circular_ll k=new Circular_ll();
		k.insert(20);
		k.insert(30);
		k.insert(40);
		k.insetfirst(48);
		k.display();
		k.deleteend();
		k.display();
		k.deletefirst();
		k.display();
	}
	void insert(int a) {
		Node4 n=new Node4(a);
		if(head==null) {
			head=tail=n;
		}tail.next=n;
		tail=n;
		tail.next=head;
		System.out.println("The inserted element is :"+a);
	}void insetfirst(int a){
		Node4 n=new Node4(a);
		if(head==null) {
			head=tail=n;
		}System.out.println("The front inserted ele is:"+a);
		n.next=head;
		head=n;
		tail.next=head;
	}
	void deleteend(){
		if(head==null) {
			System.out.println("The list is empty!");
		}Node4 temp=head;
		while(temp.next!=tail) {
			temp=temp.next;
		}System.out.println("The end element is deleted:"+tail.data);
		tail=temp;
		tail.next=head;
		
	}void deletefirst(){
		if(head==null) {
			System.out.println("The list is empty!");
		}System.out.println("The first element is deleted :"+head.data);
		head=head.next;
		tail.next=head;
	}
	void display(){
		if(head==null) {
			System.out.println("The list is empty!");
		}Node4 temp=head;
		while(true) {
			
			System.out.print(temp.data+"-->");
			temp=temp.next;
			if(temp==head) {
				break;
			}
		}System.out.println('\n');
	}
}
class Node4{
	int data;
	Node4 next;
	Node4(int a){
		data=a;
		next=null;
	}
}
