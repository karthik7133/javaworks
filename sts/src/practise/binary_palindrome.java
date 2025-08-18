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
		String s1="";
		String s2="";
		while(n!=0) {
			s1+=n%2;
			s2=n%2+s2;
			n/=2;
		}
		return (s1.equals(s2));
	}
}
