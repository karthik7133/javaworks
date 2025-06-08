package labwork;

public class shape1 {
	public static void main(String[] args) {
		circle1 c=new circle1(3,4,5);
		c.display();
		rectangle r=new rectangle(2,3,4);
		r.display();
	
	}
	

}
class shape2{
	int a;
	int b;
	int r;
	shape2(int a,int b,int r){
		this.a=a;
		this.b=b;
		this.r=r;
	}
	public void display() {
		System.out.println("From shape class{\n");
		System.out.println("value of length:"+a);
		System.out.println("value of width:"+b);
		System.out.println("value of radius:"+r);
		System.out.println("}\n");
	}
}
class circle1 extends shape2{
	circle1(int a, int b ,int r) {
		super(a, b,r);
	}
	@Override
	public void display() {
		super.display();
		System.out.println("radius of circle is:" + r+"\n");
	}
}
class rectangle extends shape2{
	rectangle(int a,int b,int r){
		super(a,b,r);
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Length:"+a +"\nBreadth:"+b);
	}
}
