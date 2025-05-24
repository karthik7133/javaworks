package week_4;
import java.util.Scanner;
public class Bank {
	public static int intial() {
		int IA=10000;
		return(IA);
	}
	public static String name() {
		Scanner x=new Scanner(System.in);
		System.out.print("enter your name:");
		String name = x.next();
		return(name);
	}
	
	public static int AN() {
		Scanner x =new Scanner(System.in);
		System.out.print("enter amount your Account number :");
		int AN = x.nextInt();
		return (AN);
	}
	public static int deposit() {
		Scanner x =new Scanner(System.in);
		System.out.print("enter amount you want to deposit :");
		int DA = x.nextInt();
		return (DA);
	}
	public static int withdraw() {
		Scanner x  =new Scanner (System.in);
		System.out.print("enter amount you want to withdraw :");
		int WA = x.nextInt();
		return(WA);
	}
	public static void main (String[] args) {
		Bank k = new Bank();
		String name =name();
		int Acnum =AN();
		int IA =intial();
		int DA =deposit();
		int WA =withdraw();
		System.out.println("Hi "+name+"welcome");
		System.out.println("your accoutn number is :"+Acnum);
		System.out.println("your intial amoutn is :"+IA);
		System.out.println("your total amoutn after deposition is :"+DA+IA);
		System.out.println("your balence after withdrawl is :"+(IA+DA-WA));
	}
}

