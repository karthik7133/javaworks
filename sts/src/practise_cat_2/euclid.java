package practise_cat_2;
import java.util.*;
public class euclid {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Enter two nums to find gcd:");
		int a=x.nextInt(),b=x.nextInt();
		System.out.println(gcd(a,b));
	}
	static int gcd(int a,int b) {
		if(a==0)return b;
		return gcd(b%a,a);
	}
}
