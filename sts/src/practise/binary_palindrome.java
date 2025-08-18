package practise;
import java.util.*;
public class binary_palindrome {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.print("enter the number to check :");
		int num=x.nextInt();
		System.out.println(ispalindrome(num));
	}
	public static boolean ispalindrome(int n) {
		int rev=0;
		int temp=n;
		while(temp!=0) {
			rev=(rev<<1)|(temp&1);
			temp>>=1;
		}
		return n==rev;
	}
}
