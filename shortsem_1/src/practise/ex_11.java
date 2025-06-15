package practise;

public class ex_11 {
	public static void main(String[] args) {
		Technical t=new Technical("me");
		t.setPrice(3, 450);
		NonTechnical n=new NonTechnical("me2");
		n.setPrice(4, 350);
	}
}
class BookStall{
	private String title ;
	private int id;private int qty;
	private double price;
	
	BookStall (String title){
		this.title=title;
	}
	public void setPrice(int qty,double price) {
		this.qty=qty;
		this.price=price;
		System.out.println("price is :"+(qty*price));
	}
}
class Technical extends BookStall{

	Technical(String title) {
		super(title);
		
		
	}
	public void setPrice(int qty,double price) {
		super.setPrice(qty, price);
	}
	
}
class NonTechnical extends BookStall{
	NonTechnical(String title){
		super(title);
	}
	public void setPrice(int qty,double price) {
		super.setPrice(qty, price);
	}
}