package leetcode;

public class merge {
	public static void main(String[] args) {
		solution1 s=new solution1();
		solution1 s2=new solution1();
		s2.add(1);s2.add(3);s2.add(4);s2.add(5);;
		s.add(1);s.add(2);s.add(4);
		int len1=0,len2=0;
		len1=s.len(s.front, len1);len2=(s2.len(s2.front, len2));
		int max=(len1>len2)?len1:len2;
		solution1 maxlist=(len1>len2)?s:s2;
		ListNode temp=maxlist.front;
		ListNode temp2=((len1<len2)?s:s2).front;
		for(int i=0;i<max;i++) {
			if(temp2.val<=temp.val) {
				maxlist.addatpos(i, temp2.val);
			}temp=temp.next;temp2=temp2.next;
		}
		maxlist.display();
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
	public int len(ListNode head,int len) {
		ListNode temp=head;
		while(temp!=null) {
			len++;temp=temp.next;
		}return len;
	}
	public void addatpos(int pos,int data) {
		ListNode a=new ListNode(data);
		if(pos==0) {
			a.next=front;front=a;return;
		}
		ListNode temp=front;
		for(int i=0;i<pos-1;i++) {
			temp=temp.next;
		}a.next=temp.next;
		temp.next=a;
	}
}
