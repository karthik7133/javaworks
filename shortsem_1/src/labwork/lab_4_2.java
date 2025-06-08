package labwork;

public class lab_4_2 {
	public static void main(String[] args) {
		calculate c=new calculate();
		c.add(3, 4,5);
		c.sub(4,3,2);
		c.div(2.0,3.0);
	}

}
class calculator{
	public void add(int a,int b) {
		
	}
	public void sub(int a,int b) {
		
	}
	public void mul(int a,int b) {
		
	}
	public void div(float a,float b) {
		
	}
}
class calculate extends calculator{
	public void add(int a,int b ,int c){
		System.out.println("sum :"+(a+b+c));
	}
	public void sub(int a,int b,int c) {
		System.out.println("diff is:"+(a-b-c));
	}
	public void mul(int a,int b ,int c) {
		System.out.println("Product is:"+(a*b*c));
	}
	public void div(double  a,double b) {
		System.out.println("remainder is:"+(a/b));
	}
}
