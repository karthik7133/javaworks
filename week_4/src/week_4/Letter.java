package week_4;
import java.util.Scanner; 
public class Letter{
	public int a;  String k;
	public void karthik(int i){
		this.a = i;
	}
	void String() {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter your line :");
		String na=x.nextLine();
		k = na;
		System.out.println("your line is :"+k);
		x.close();
	}
	public static void main (String[] args) {
		Scanner  x = new Scanner(System.in);
		System.out.print("Enter any number :");
		int s =x.nextInt();
		x.nextLine();
		Letter b = new Letter();
		b.karthik(s);
		System.out.println("your number is :"+b.a);
		b.String();
	}
}
	

