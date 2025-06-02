package shortsem_1;
import java.util.*;
public class Main {
	public static void main(String[] args) throws ivaliedinputException{
		Scanner x =new Scanner(System.in);
		Calc c1=new Calc();
		System.out.println("Enter the a,b and operation:");
		try {
			int a=x.nextInt();
			int b=x.nextInt();
			char c=x.next().charAt(0);
			c1.operation(a, b, c);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(ivaliedinputException i) {
			i.printStackTrace();
		}catch(Exception d) {
			System.out.println("Default exception");
			d.printStackTrace();
		}
	}
}
class Calc{
	public void operation(double a ,double b,char c) throws ivaliedinputException {
		switch (c) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			throw new ivaliedinputException("invalied operator"+c);
		
		}
		
		
	}
}
class ivaliedinputException extends Exception{
	ivaliedinputException(String message){
		super(message);
	}
}