package shortsem_1;
class Calculator{
	public void add(int a,int b) {
		System.out.println("Sum:"+(a+b));
	}
	public void mul(int a,int b) {
		System.out.println("product:"+(a*b));
	}
	public void div(int a,int b) {
		float c=a/b;
		System.out.println("remainder:"+c);
	}
	public void sub(int a,int b) {
		System.out.println("difference:"+(a-b));
	}
	
}
public class Classandobj {
	public static void main(String[] a) {
		if(a.length>0) {
			System.out.println("Hello");
			System.out.println(a[0]);
		}
		Calculator c=new Calculator();
		c.add(1, 3);c.mul(2, 3);c.div(4, 5);c.sub(4, 4);;
	}
}
