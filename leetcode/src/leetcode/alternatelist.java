package leetcode;

public class alternatelist {
	public static void main(String[] args) {
		sol a =new sol();
		a.add(1);
		a.add(2);a.add(3);a.add(4);a.alternate();
		a.display();
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
	public void alternate() {
	    if (head == null || head.next == null) {
	        return;
	    }
	    ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    ListNode prev = dummy;
	    ListNode first = head;
	    ListNode second = head.next;
	    while (first != null && second != null) {
	        ListNode nextPair = second.next;
	        second.next = first;
	        prev.next = second;
	        first.next = nextPair;
	        prev = first;
	        first = nextPair;
	        if (first != null) {
	            second = first.next;
	        } else {
	            second = null;
	        }
	    }
	    this.head = dummy.next;
	}

}
