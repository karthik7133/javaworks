package lab;
import java.util.*;
public class Chartypecounter {
	static Scanner x = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Names:");
		String a = x.next();
		int a1=0;
		int a2=0;
		int a3=0;
		for(int i=0;i<a.length();i++) {
			String c=""+a.charAt(i);
			if (c.matches("[a-zA-Z]")) {
				a1=1;
				
			} if (c.matches("[0-9]")) {
				a2=2;
				System.out.println(Integer.valueOf(c));
			}if(!c.matches("[a-zA-Z0-9]")) {
				a3=3;
				System.out.println("It contains special  char:"+c);
			}
		}
		if (a1==1) {
			System.out.println("It contains alphabet");
		}if (a2==2) {
			System.out.println("it contains numeric");;
		}if (a3==3) {
			System.out.println("It contains special charecter");
		}
		
	}
}
