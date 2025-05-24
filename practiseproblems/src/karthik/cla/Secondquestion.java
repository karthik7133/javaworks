package karthik.cla;
import java.util.Scanner;
public class Secondquestion {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Eter ur name :");
		String name = x.nextLine();
		int l1 = name.length();
		System.out.print("Enter password :");
		String pass=x.nextLine();
		if (pass.matches(".*[A-Z].*") & pass.matches(".*[a-z].*[a-z].*") & pass.matches(".*\\d.*") & pass.matches(".*[^A-Za-z0-9].*") ) {
		}
		if (pass.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,}")) {
			if (name.matches(".*[aiAI]")) {
				System.out.println("Pedha password aa madam "+name);
			}else {
				System.out.println("pedha password aa "+name+" bro" );
			}
		}else {
			if (name.matches(".*[aiAI]"))
			System.out.println("Password must contain one upper case one lower casae and one special charecter madam "+name);
			else {
				System.out.println("Password must contain one upper case one lower casae and one special charecter ra bosadike("+name+")");
			}
		}
	}
		
}