package practise;
import java.util.*;
public class ex_20 {
	static Scanner x=new Scanner(System.in);
	public static void main(String[] args) {
		login l=new login();
		System.out.print("enter user name:");
		String a=x.nextLine();
		try {
//			System.out.println(a);
			l.check(a);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
class login{
	public void check(String a) throws Exception {
		if(a.length()<6)throw new InvaliedUsernameException("Username is too short!");
		if(a.contains(" ")) throw new IllegalArgumentException("Not valied user name!");
		else {
			System.out.println("Login successfull!");
		}
	}
}
class InvaliedUsernameException extends Exception{
	InvaliedUsernameException(String message) {
		super(message);
	}
}
