package practise;

public class ex_31 {
	public static void main(String[] args) {
		shape arr[]=new shape[5];
		arr[0]=new Rectangle(2,3);
		arr[1]=new circle(3);
		arr[3]=new Rectangle(4,5);
		arr[2]=new circle(4);
		for(shape s:arr) {
			if(s!=null) {
				s.getArea();
			}
		}
	}
}
abstract class shape{
	abstract void getArea();
}
class Rectangle extends shape{
	int len,width;
	Rectangle(int a,int b){
		len=a;width=b;
	}
	@Override
	void getArea() {
		System.out.println("Area is:"+(len*width));	
	}
}
class circle extends shape{
	int radius;
	circle(int a){
		radius=a;
	}
	@Override
	void getArea() {
		System.out.println("Area of circle is:"+(Math.PI*Math.pow(radius, 2)));
	}
	
}
