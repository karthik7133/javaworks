package leetcode;

public class bin_decimalin_linkedlist {
	public static void main(String[] args) {
		sol2 s=new sol2();
		s.add(1);
		s.add(2);
		s.add(3);
		s.display();
	}
}
class sol2{
	ListNode head;
	sol2(){
		this.head=null;
	}
	public void add(int data) {
		ListNode newnode=new ListNode(data);
		if(head==null) {
			head=newnode;return;
		}
		ListNode temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
	}
	public void display() {
		if(head==null) {
			System.out.println("List is empty");
			return; 
		}
		ListNode temp=head;
		while(temp!=null) {
			System.out.print(temp.val+"->");
			temp=temp.next;
		}System.out.println("null");
	}
	public void converter() {
		
	}
}