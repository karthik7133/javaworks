package practise;

public class ex_28 {
	public static void main(String[] args) {
		MobileAccount m=new MobileAccount(8019325524l,"karthik",20.0);
		m.recharge(5);
		m.servicecharges();
		m.display();
		m.getbalance();
	}
}
class MobileAccount{
	long phno;
	String name;
	double balance;
	MobileAccount(long a,String b,double balance){
		this.phno=a;
		this.name=b;
		this.balance=balance;
	}
	public void recharge(int amount) {
		if(amount>0)
		balance+=amount;
	}
	public void servicecharges() {
		if(balance>=5)balance-=5;
	}
	public void getbalance() {
		System.out.println("\ncurrent balance:"+balance);
	}
	public void display(){
		System.out.printf("Phone no:%d Name:%s ",phno,name);
	}
}