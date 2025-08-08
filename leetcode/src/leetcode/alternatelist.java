package leetcode;

public class alternatelist {
	public static void main(String[] args) {
		sol a =new sol();
		a.add(1);a.display();
	}
}
class sol{
	ListNode head;
	sol(){
		this.head=null;
	}
	public void add(int data) {
		ListNode newnode =new ListNode(data);
		if(head==null) {
			head=newnode;
			return;
		}
		ListNode temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}temp.next=newnode;
	}
	public void display() {
		if(head==null) {
			return;
		}
		ListNode temp=head;
		while(temp!=null) {
			System.out.print(temp.val +"->");
			temp=temp.next;
		}System.out.println("null");
	}
}
