package practise;

public class ex_22 {
	public static void main(String[] args) {
		bank b =new bank();
		Runnable r1=()->{
			
			b.withdraw(2000);
			b.display();
		};
		Thread t1=new Thread(r1,"user-1");
		Thread t2=new Thread(()->{
			
			b.withdraw(6000);
			b.display();
		},"user-2");
		Thread t3=new Thread(()->{
			b.withdraw(3000);
			b.display();
		},"user-3");
		Thread t4=new Thread(()->{
			b.withdraw(3000);
			b.display();
		},"user-4");
		Thread t5=new Thread(()->{
			b.withdraw(7000);
			b.display();
		},"user-5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
class bank{
	double balance=20000;
	public synchronized void withdraw(double amount) {
		if (amount<=balance) {
			System.out.println("\n-"+amount);
			balance-=amount;
		}else System.out.println("\nlow balance!");
	}
	public synchronized void display() {
		System.out.println(Thread.currentThread().getName() );
		System.out.println("current balance is:"+balance);
	}
}
