package practise;

public class ex_10 {
	public static void main(String[] args) {
		Customers a=new Customers("Karthik","author1","paper",500);
		Customers b=new Customers("Lahari","author2","kindle",500);
		Customers c=new Customers("krithika","author3","paper",500);
		a.calculate_Discount();
		b.calculate_Discount();
		c.calculate_Discount();
	}
}
interface Discount{
	void calculate_Discount();
}
class Books{
	public String name,author,type;
	double price;
	Books(String a,String b,String c,double d) {
		this.name=a;this.author=b;this.type=c;
		this.price=d;
	}
	
}
class Customers extends Books implements Discount  {
	Customers(String a,String b,String c,double d) {
		super(a,b,c,d);
	}

	@Override
	public void calculate_Discount() {
		if(type=="paper") {
			price=price*0.85;
			System.out.println("Amount after discount :"+price);
		}else {
			System.out.println("Amount after discount :"+(price*0.9));
		}
		
	}
	
}
