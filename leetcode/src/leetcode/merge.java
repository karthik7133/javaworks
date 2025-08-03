package leetcode;

public class merge {
	public static void main(String[] args) {
		solution1 s=new solution1();
		solution1 s2=new solution1();
		s2.add(1);s2.add(3);s2.add(4);s2.add(5);;
		s.add(1);s.add(2);s.add(4);
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
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }
        return dummy.next;
    }
}
