package dsa;

public class Single_ll {
	Node3 front;
	Node3 rear;
	Single_ll(){
		front=rear=null;
	}
	public static void main(String[] args) {
		Single_ll k=new Single_ll();
		k.insfront(19);
		k.insfront(29);
		k.insrear(69);
		k.insrear(67);
		k.display();
		k.delfront();
		k.delrear();
		k.display();
	}void insfront(int a){
		Node3 n=new Node3(a);
		if(front==null) {
			front=rear=n;
		}System.out.println("The inserted data is:"+a);
		n.next=front;
		front=n;
	}void insrear(int a){
		Node3 n=new Node3(a);
		if(front==null) {
			front=rear=n;
		}System.out.println("The inserted data is:"+a);
		rear.next=n;
		rear=n;
	}void delfront(){
		if(front==null) {
			System.out.println("The list is empty!");
		}System.out.println("\nThe dleted element is :"+front.data);
		front=front.next;
	}void delrear(){
		if(front==null) {
			System.out.println("The list is empty!");
		}if (front.next == null) { 
	        System.out.println(front.data + " is deleted!");
	        front = null; 
	        return;
	    }
		Node3 temp=front;
		while(temp.next.next!=null) {
			temp=temp.next;
		}System.out.println("\n"+temp.next.data+"is deleted!");
		temp.next=null;
	}void display(){
		if(front==null) {
			System.out.println("the list is empty!");
		}Node3 temp=front;
		while(temp!=null) {
			if(temp.next==null)
			System.out.print(temp.data+"-->null");
			else {
				System.out.print(temp.data+"-->");
			}temp=temp.next;
		}
	}
	
}
class Node3{
	int data;
	Node3 next;
	Node3(int a){
		data= a;
		next=null;
	}
}
