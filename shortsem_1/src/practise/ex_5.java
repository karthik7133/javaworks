package practise;

public class ex_5 {
	public static void main(String[] args) {
		creditcard c =new creditcard();
		c.processPayment(500);
	}
}

interface paymentMethod{
	void processPayment(double amount);
	
}
class creditcard implements paymentMethod{

	@Override
	public void processPayment(double amount) {
		if(amount>100)System.out.println("Transaction of "+amount+" is successfull on your credit card!");
		else System.out.println(amount+" is Too low to transfer!");
	}
	
}
class paypal implements paymentMethod{

	@Override
	public void processPayment(double amount) {
		if(amount>100)System.out.println("Transaction of "+amount+" is successfull on your paypal!");
		else System.out.println(amount+" is Too low to transfer!");
		
	}
	
}
class Banktransfer implements paymentMethod{

	@Override
	public void processPayment(double amount) {
		if(amount>100)System.out.println("Transaction of "+amount+" is successfull on your bank account!");
		else System.out.println(amount+" is Too low to transfer!");
		
	}
	
}
