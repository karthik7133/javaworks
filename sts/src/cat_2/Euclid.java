package cat_2;
import java.util.Scanner;
public class Euclid {
	public static void main(String[] args) {
		Scanner x =new Scanner(System.in);
		System.out.print("Enter two nums:");
		int a=x.nextInt(),b=x.nextInt();
		System.out.println(GCD(a,b));;
	}

	private static int  GCD(int a, int b) {
		if(a==0)return b;
		return GCD(b%a,a);
	}
}
