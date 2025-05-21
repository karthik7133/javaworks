package labwork;
import java.util.*;
public class lab_1 {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println(operations.rev(1234));
		System.out.println(operations.fac(5));
		System.out.println(operations.ispalindrome("tat"));
		int []a= {1,4,2};
		System.out.println(operations.sort2(a));
		System.out.println(operations.sort(a));
		System.out.println(operations.vowelcount("kartihk"));
	}
}
class operations{
	public static int rev(int a) {
		int c=a;
		int rev=0;
		while(c!=0) {
			int digit=c%10;
			rev=rev*10+digit;
			c=c/10;
		}
		return rev;
	}
	
	public static int fac(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}return fact;
	}
	public static boolean ispalindrome(String a) {
		char b[]=a.toCharArray();
		boolean flag=true;
		char c[]=new char[b.length+2];
		for(int i=0;i<a.length();i++) {
			c[a.length()-i-1]=b[i];
		}
		for(int j=0;j<a.length();j++) {
			if(c[j]!=b[j]) {
				flag=false;
				break;
			}
		}return flag;
	}
	public static String sort(int [] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}return Arrays.toString(a);
	}
	public static String sort2(int [] a) {
		Arrays.sort(a);
		return Arrays.toString(a);
	}
	public static int vowelcount(String a) {
		a=a.toLowerCase();
		char v[]= {'a','e','i','o','u'};
		int count=0;
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<v.length;j++) {
				if(a.charAt(i)==v[j]) {
					System.out.print(a.charAt(i)+",");
					count++;
				}
			}
		}return count;
	}

}
