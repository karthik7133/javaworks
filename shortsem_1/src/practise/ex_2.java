package practise;

public class ex_2 {
	public static void main(String[] args) {
		BankAccount b=new BankAccount("1234","karthik",23000,"namma bank");
		b.displayBalance();
		b.deposit(3000);
		b.displayBalance();
		b.withdraw(25500);
		b.displayBalance();
	}
}
class BankAccount{
	private String acno;
	private String acholdername;
	private double balance;
	static String bankName;
	
	BankAccount(String acno,String a,double b,String name){
		this.acno=acno;
		this.acholdername=a;
		this.balance=b;
		this.bankName=name;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		if(balance>amount+1000) {
			balance-=amount;
		}else System.out.println("No enough balance");
	}
	public void displayBalance() {
		System.out.println("Name :"+acholdername);
		System.out.println("acno :"+acno);
		System.out.println("bankname :"+bankName);
		System.out.println("balance is : "+balance);
		
	}
	
}
