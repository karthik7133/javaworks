package shortsem_1;
import java.util.*;
public class conditionalstmnts {
	public static void main(String[] args) {
		operations.signfind();
		operations.eveodd();
		operations o=new operations(7,"karthik",89);
		
	}
}
class operations{
	int a;
	String c;
	int alpha;
	public operations(int a,String c,int and) {
		this.c=c;
		this.a=a;
		alpha=and;
	}
	public static void signfind() {
		Scanner x=new Scanner(System.in);
		System.out.print("Enter the number:");
		int a=x.nextInt();
		if(a<0)  System.out.println("Number is -ve");
		else if(a==0)System.out.println("Number is 0");
		else System.out.println("Number is +ve");
	}
	public static void eveodd() {
		Scanner x=new Scanner(System.in);
		System.out.print("Enter the number:");
		int a=x.nextInt();
		if(a%2==0)  System.out.println("Number is even");
		else System.out.println("Number is odd");
	}
	public static void eligibility() {
		Scanner x=new Scanner(System.in);
		System.out.print("Enter the number:");
		int a=x.nextInt();
		
		
	}
	
}
