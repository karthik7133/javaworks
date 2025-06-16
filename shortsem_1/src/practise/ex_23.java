package practise;

public class ex_23 {
	public static void main(String[] args) throws InterruptedException {
		ticketbooking t=new ticketbooking();
		Thread t1=new Thread(()->{
			t.book(10);
		});
		Thread t2=new Thread(()->{
			t.book(10);
		});
		Thread t3=new Thread(()->{
			t.book(1);
		});
		t1.start();t2.start();t3.start();
		t1.join();t2.join();t3.join();
		System.out.println("total price:"+((20-t.tickets)*20));
	}
}
class ticketbooking{
	int tickets=20;
	 
	public synchronized void book(int n) {
		if(n<=tickets) {
			synchronized(this) {
				tickets-=n;
			}
			System.out.println("successfully boooked"+n+"tickets");
		}else {
			System.out.println("Sorry,Available Tickets  are: "+tickets);
		}
	}
}
