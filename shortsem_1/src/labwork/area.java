package labwork;

public class area {
	public static void main(String[] args) {
		shape s=new shape();
		s.areac(4);
		s.arear(3, 4);
		s.area(4, 5);
		
	}
}
abstract class abc{
	abstract void areac(double a);
	abstract void arear(int l,int b);
	public void area(int a,int b) {
		System.out.println(a*b);
	}
	
}
class shape extends abc{

	

	@Override
	void areac(double a) {
		// TODO Auto-generated method stub
		System.out.println("area of circle:"+ (Math.PI*a*a));
	}

	@Override
	void arear(int l, int b) {
		// TODO Auto-generated method stub
		System.out.println("area of rectangel"+(l*b));
		
	}
	
}
