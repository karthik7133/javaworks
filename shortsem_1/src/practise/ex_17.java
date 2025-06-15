package practise;

public class ex_17 {
	public static void main(String[] args) {
		Employee t1=new Employee("Thread1");
		t1.start();
//		manager m1=new manager();
//		Thread t2=new Thread(m1,"thread2");
//		t2.start();
//		Runnable r1=new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("Hello "+Thread.currentThread().getName());
//			}
//			
//		};
//		Runnable r1=()->{
//			System.out.println("Hello "+Thread.currentThread().getName());
//		};
		Thread t2=new Thread(()->System.out.println("hello"));
		t2.start();
	}
}
class Employee extends Thread{
	Employee(String name){
		super(name);
	}
	@Override
	public void run() {
		System.out.println("HI "+Thread.currentThread().getName());
	}
}
class manager implements Runnable{
	public void run() {
		System.out.println("Hello "+Thread.currentThread().getName());
	}
}

