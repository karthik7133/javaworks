package mounika;
import java.util.Scanner;
public class Powerofno {
	static Scanner x = new Scanner(System.in);
	public static void power(int a, int b,int c) {
		if (c==0) {
			System.out.println(1);
		}else {
		if (c==1) {
			System.out.println(b);
			return;
		}
		power(a,b*a,c-1);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the base :");
		int a =x.nextInt();
		System.out.println("Enter the power :");
		int c = x.nextInt();
		int b =a;
		Powerofno.power(a, b, c);
	}
}
