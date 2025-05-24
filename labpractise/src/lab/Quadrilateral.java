package lab;
import java.util.*;
class Quadrilaterals {
	static void area() {
	}
}
class trapezoid extends Quadrilaterals{
	static void area(double a ,double b,double c) {
		double area =((a+b)/2)*c;
		System.out.println("Area of Trapezoid"+area);
	}
}class  isosceles_Trapezoid extends trapezoid{
	static void area(double a ,double b, double c) {
		double area =((a+b)/2)*c;
		System.out.println("Area of isosceles_Trapezoid is :"+area);
	}
}
class parallelogram extends Quadrilaterals{
	static void area(double a,double b) {
		double area = a*b;
		System.out.println("Area of parallelogram is :"+area);
	}
}
class Rhombus extends parallelogram{
	static void area(double a ,double b) {
		double area =(a*b)/2;
		System.out.println("Area of Rhombus is :" +area);
	}
}class Rectangle extends parallelogram{
	static void area(double a,double b) {
	double area = (a*b)/2;
	System.out.println("Area of rectangle is :"+ area);
	}
}class Square extends Rectangle{
	static void area(double a) {
		double area = a*a;
		System.out.println("Area of Square is :" + area);
	}
}
public class Quadrilateral extends Quadrilaterals{
	public static void main(String[] args) {
		System.out.println("1.trapezoid \n2.isosceles_Trapezoid \n3.parallelogram \n4.Rhombus \n5.Rectangel \n6.Square");
		System.out.println("Choose the Quadrilateral to find area :");
		Scanner x = new Scanner(System.in);
		int a =x.nextInt();
		switch(a) {
		case 1:
			System.out.println("Enter the base 1 , base 2 and height :");
			trapezoid.area(x.nextDouble(),x.nextDouble(),x.nextDouble());
			break;
		case 2 :
			System.out.println("Enter the base 1 ,base 2 and height :");
			isosceles_Trapezoid.area(x.nextDouble(),x.nextDouble(),x.nextDouble());
			break;
		case 3:
			System.out.println("Enter the length of base and height :");
			parallelogram.area(x.nextDouble(),x.nextDouble());
			break;
		case 4:
			System.out.println("Enter the length of d1 AND d2 :");
			Rhombus.area(x.nextDouble(),x.nextDouble());
			break;
		case 5:
			System.out.println("enter the length and width of rectangel :");
			Rectangle.area(x.nextDouble(),x.nextDouble());
			break;
		case 6:
			System.out.println("Enter the side of a square :");
			Square.area(x.nextDouble());
		}}}

