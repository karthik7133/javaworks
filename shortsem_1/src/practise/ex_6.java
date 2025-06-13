package practise;

import java.util.*;

public class ex_6 {
	int bal=20000;
	public static void main(String[] args) throws Exception {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the amount to withdraw:");
		ex_6 e=new ex_6();
		try {
			e.withdraw(x.nextInt());
		} catch (InputMismatchException e2) {
			e2.printStackTrace();
		}
	}
	public void withdraw(int amount) throws Exception{
		if(amount>bal) {
			throw new ArithmeticException ("amount is greater than available balance");
		}else {
			System.out.println("amount withdraw successful!");
			bal=bal-amount;
		}
		System.out.println("Balance :"+bal);
		
	}
	

}

