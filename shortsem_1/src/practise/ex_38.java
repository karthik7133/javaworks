package practise;

public class ex_38 {
	public static void main(String[] args) throws Exception {
		BankAccount1 b=new BankAccount1();
		Thread t1=new Thread(()->{
			b.withdraw(400);
		},"user-1");
		Thread t2=new Thread(()->{
			b.withdraw(600);
		},"user-2");
		Thread t3=new Thread(()->{
			b.withdraw(400);
		},"user-3");
		t1.start();
		t2.start();
		t3.start();
		t1.join();t2.join();t3.join();
		System.out.println("current balance:"+b.balance);
	}

}
class BankAccount1{
	double balance=1000;
	public synchronized void withdraw(double amount) {
		System.out.println("\n"+Thread.currentThread().getName()+" requested withdrawl of:"+amount);
		if(balance>=amount) {
			balance-=amount;
			System.out.println("withdraw successful!");
		}else {
			System.out.println("Not enough money");
		}
	}
}
