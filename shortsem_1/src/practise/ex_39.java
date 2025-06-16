package practise;
import java.util.*;
public class ex_39 {
	static boolean done=false;
	static Scanner x=new Scanner(System.in);
	public static void main(String[] args) {
		Thread t1=new Thread(()->{
			try {
				Thread.sleep(5000);
			}catch(Exception e) {
				System.out.println(e);
			}
			if(done==false) {
				System.out.println("\nAuto submission is done!");
			}
		});
		t1.start();
		
		
		System.out.print("for submission enter done:");
		String y=x.next();
		if(y.equalsIgnoreCase("done")) {
			System.out.println("Submission done manually");
			done =true;
		}
	}
}
