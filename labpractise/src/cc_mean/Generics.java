package cc_mean;
import java.util.*;
public class Generics {
	public static void main(String[] args) throws InterruptedException {
		mythread k= new mythread("1");
		mythread k1= new mythread("2");
		mythread k2= new mythread("3");
		
		King k4 = new King();
		Thread n = new  Thread(k4);
		k.start();
		k.join();
		k1.start();
		k1.join();
		k2.start();
		
		
		
		
	}
}
class mythread extends Thread{
	mythread(String name)  {
		super(name);
	}
	@Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName());
		}
	}

class King implements Runnable{
	public void run() {
		for(int i=1;i<11;i++) {
			if(i%2==1) {
				System.out.println("Thread B"+i);
			}
		}
	}
}
