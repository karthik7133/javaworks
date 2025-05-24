package mounika;

public class dll {
	node front,rear;
	dll(){
		front=rear=null;
	}
	class node{
		node next;
		node prev;
		int data;
		node(int a){
			data=a;
			next=prev=null;
		}
	}
	public static void main(String[] args) {
		dll d=new dll();
		d.insertfirst(9);
		d.insertfirst(19);
		d.insertfirst(1);
		d.insertrear(23);
		d.insertrear(34);
		d.delend();
		d.display();
	}
	void insertfirst(int a) {
		node n=new node(a);
		if(front==null){
			rear=front=n;
			return;
		}n.next=front;
		front.prev=n;
		front=n;
	}
	void insertrear(int a) {
		node n=new node(a);
		if(front==null) {
			rear=front=n;
			return;
		}else {
			n.prev=rear;
			rear.next=n;
			rear=n;
		}
	}
	void delend() {
		System.out.println(rear.data+"is deleted");
		rear=rear.prev;
		rear.next=null;
	}
	void display() {
		node t=front;
		while(t!=null) {
			System.out.print(t.data+"-->");
			t=t.next;
		}System.out.print("null\n");
	}
}
