package labwork;

public class dynamic {
	public static void main(String[] args) {
		System.out.println("HI");
		Shape1 s=new Circle1();
		s.area();
		Shape1 r=new Rectangle1();
		r.area();
	}
}


class Shape1{
	public void area() {
		System.out.println("From shape class area To be finded!");
	}
}
class Circle1 extends Shape1 {
	@Override
	public void area() {
		System.out.println("form circle class");
	}
}
class Rectangle1 extends Shape1{
	@Override
	public void area() {
		System.out.println("this is form rectangle class!");
	}
}