package leetcode;

public class linkedlist {
	public static void main(String[] args) {
		list l=new list();
		l.adddata(10);
		l.adddata(20);
		l.adddata(30);
		l.adddata(40);
		l.displaydata();
		l.deleteatindex(2);
		l.displaydata();
		System.out.println("hi");
	}
	
}
class list{
	card first;
	list(){
		this.first=null;
	}
	public  void adddata(int data) {
		card newcard=new card(data);
		if(first==null) {
			first=newcard;
			return;
		}
		card last=first;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=newcard;
	}
	public void displaydata() {
		if(first==null) {
			return;
		}
		card temp=first;
		while(temp!=null) {
			if(temp.next!=null)
			System.out.print(temp.data+"->");
			else System.out.println(temp.data+"->null");
			temp=temp.next;
		}
	}
	public void deleteatindex(int a) {
		if (first == null) {
	        System.out.println("List is empty. Cannot delete.");
	        return;
	    }
		int len=0;
		card temp=first;
		while(temp!=null) {
			len++;
			temp=temp.next;
		}
		if (a == len) { 
	        first = first.next;
	        return;
	    }
		if (a <= 0 || a > len) {
	        System.out.println("Invalid position 'n'. Cannot delete.");
	        return;
	    }
		System.out.println(len);
		int delindex=len-a-1;
		temp=first;
		for(int i=0;i<delindex;i++) {
			temp=temp.next;
		}
		if (temp.next != null) {
	        temp.next = temp.next.next; 
	    }
	}
	
}
class card{
	int data;
	card next;
	card(int data){
		this.data=data;
		this.next=null;
	}
}
