package shortsem_1;
import java.util.*;
public class Strings {
	public static void main(String[] args) {
		Scanner x =new Scanner(System.in);
		System.out.print("Enter String: ");
		String a=x.nextLine();
		System.out.println(a.charAt(a.length()-1));
		System.out.println(stringops.lencalculator(a));
		System.out.println(stringops.vovconcount(a));
		System.out.println(stringops.rev(a));
		stringops.toupper1(a);
		System.out.println("Is palindrome : " +stringops.ispalindrome(a));
		System.out.println("No of words are :"+stringops.wordcounter(a));
		System.out.println("without spaces:"+stringops.spaceremover(a));
		System.out.println("freq of each letter:");
		stringops.freqcounter(a);
	}
}
class stringops{
	public static int lencalculator(String a) {
		int i=0;
		for(char c:a.toCharArray()) 
			i++;
		return i;
	}
	public static String vovconcount(String a) {
		a=a.toLowerCase();
		int v=0,c=0;
		String b="aeiou";
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<b.length();j++) {
				if(a.charAt(i)==b.charAt(j)) {
					v++;
				}
			}
		}c=a.length()-v;
		int arr[]= {v,c};
		return Arrays.toString(arr);
	}
	public static String rev(String a) {
		char []b=a.toCharArray();
		String c="";
		for(int i=a.length()-1;i>=0;i--) {
			c=c+a.charAt(i);
		}
		return c;
	}
	public static boolean ispalindrome(String a) {
		String b=stringops.rev(a);
		boolean flag=false;
		if(a.equalsIgnoreCase(b))
			flag=true;
		return flag;
	}
	public static void toupper1(String a) {
		char c[]=a.toCharArray();
		String d="";
		for(char i:c) {
			d=d+(char)(i-32);
		}System.out.println(d);;
	}
	public static int wordcounter(String a) {
		String c[]=a.split(" ");
		return c.length;
	}
	public static String spaceremover(String a) {
		String c[]=a.split(" ");
		String d="";
		for(String e:c) {
			d+=e;
		}
		return d;
	}
	public static void freqcounter(String d) {
		String a=stringops.spaceremover(d);
		int count=0;
		char ch[]=a.toCharArray();
		for(char c:ch) {
			for(char e:ch) {
				if(c==e) {
					count+=1;
				}
			}System.out.println(c+" - "+count);count=0;
		}
	}
}
