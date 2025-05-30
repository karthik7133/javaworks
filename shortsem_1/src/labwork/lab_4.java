package labwork;

public class lab_4 {
	public static void main(String[] args) {
		System.out.println();
		child c=new child();
		c.add(3, 4);
		c.sub(5, 2);
		c.mul(4, 3);
		c.div(5, 3);
	}
}
class calc{
	public void add(int a,int b) {
		System.out.println("Sum is :"+(a+b));
	}
	public void sub(int a,int b) {
		System.out.println("Diff is:"+(a-b));
	}
}
class child extends calc{
	public void mul(int a,int b) {
		System.out.println("Product is :"+(a*b));
	}
	public void div(float a,float b) {
		float c=a/b;
		System.out.println("remainder is:"+c);
	}
}
