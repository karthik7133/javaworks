package leetcode;

public class addtwonums {
	public static void main(String[] args) {
		adder a=new adder();
		a.add(2);a.add(4);a.add(3);
		adder b=new adder();
		b.add(5);b.add(6);b.add(4);
		a.display();b.display();
		int total=a.total()+b.total();
		System.out.println(a.total()+b.total());
		adder c=new adder();
		while(total!=0) {
			c.add((int)total%10);
			total/=10;
		}
		c.display();
		
	}
}
class adder{
	ListNode head;
	adder(){
		head=null;
	}
	public void add(int data) {
		ListNode newnode=new ListNode(data);
		if(head==null) {
			head =newnode;
			return;
		}
		ListNode last=head;
		while(last.next!=null){
			last=last.next;
		}
		last.next=newnode;
	}
	public void display() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		ListNode temp=head;
		while (temp != null) {
            System.out.print(temp.val); 

            if (temp.next != null) {
                System.out.print(" -> "); 
            }
            temp = temp.next; 
        }
        System.out.println(" -> null");
	}
	public int  total() {
		int total=0;
		if(head==null) {
			return 0;
		}
		ListNode temp=head;
		while(temp!=null) {
			total=(total*10)+temp.val;
			temp=temp.next;
		}return total;
	}
}
class ListNode{
	int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) {
	    	  this.val = val;
	      }
	      ListNode(int val, ListNode next) {
	    	  this.val = val; this.next = next; 
	      }
}