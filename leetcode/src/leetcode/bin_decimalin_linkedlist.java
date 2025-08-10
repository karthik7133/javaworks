package leetcode;

public class bin_decimalin_linkedlist {
	public static void main(String[] args) {
		sol2 s=new sol2();
		s.add(1);
		s.add(0);
		s.add(1);
		s.display();
		s.num();s.convet();
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
	public void converter(int a) {
		int count=0;int sum=0;
		while(a>0) {
			if(a%10!=0)
			sum+=(a%10)*Math.pow(2, count);count++;
			a/=10;
		}System.out.println(sum);
	}
	public String num() {
		String a="";
		if(head==null) {
			System.out.println("List is empty");
			return null; 
		}
		ListNode temp=head;
		while(temp!=null) {
			a+=String.valueOf(temp.val);
			temp=temp.next;
		}return a;
	}
	public void convet() {
		ListNode temp=head;
		int val=0;
		while(temp!=null) {
			val=val*2+temp.val;
			temp=temp.next;
		}System.out.println(val);
	}
}