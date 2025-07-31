package leetcode;

public class linkedlist {
	public static void main(String[] args) {
		list l=new list();
		l.adddata(10);
		l.adddata(20);
		l.displaydata();
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
	
}
class card{
	int data;
	card next;
	card(int data){
		this.data=data;
		this.next=null;
	}
}
