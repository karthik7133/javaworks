package leetcode;

public class merge {
	public static void main(String[] args) {
		solution1 s=new solution1();
		s.add(10);s.add(20);s.add(30);
		s.addatpos(0, 7);
		s.display();
	}
}
class solution1{
	ListNode front;
	public void add(int data) {
		ListNode a=new ListNode(data);
		if(front==null) {
			front=a;
			return;
		}
		ListNode temp=front;
		temp=front;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=a;
		
	}
	public void display() {
		ListNode temp;
		temp=front;
		while(temp!=null) {
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.println("null");
		
	}
	public void addatpos(int pos,int data) {
		ListNode a=new ListNode(data);
		if(front==null) {
			front=a;
			return;
		}
		ListNode temp1=front;
		while(pos!=0) {
			temp1=temp1.next;
			pos--;
		}
		temp1.next=a;a.next=temp1.next.next;
	}
}
