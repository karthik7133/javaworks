package karthik.cla;
import java.io.InputStream;
import java.util.Scanner;
class Rectangle{
	void nopara() {
		int len = 20;
		int width = 4;
		int a=len*width;
		int perimeter=2*(len+width);
		System.out.println("This is output of pre defined varibles :");
		System.out.println("area of rectangle is : "+a);
		System.out.println("perimeter of  rectangle is : "+perimeter);
		System.out.println();}	
	void onepara(double j) {
		double s = j;
		double a = Math.pow(s, 2);
		double peri = 4*s;
		System.out.println("area of square is : "+a);
		System.out.println("perimeter of  square is : "+peri);
		System.out.println();}	
	void twopara(double i ,double j) {
		double l = i;
		double w = j;
		double a = i*j;
		double peri = 2*(l+w);
		System.out.println("area of rectangle is : "+a);
		System.out.println("perimeter of  rectangle is : "+peri);
		System.out.println();}}
public class Class_assignment{
	public static void main(String[] args) {
		Rectangle b = new Rectangle();
		b.nopara();
		Scanner x = new Scanner(System.in);
		System.out.print("Enter the side of square :");
		double k = x.nextDouble();
		b.onepara(k);
		System.out.print("Enter the length of rectangle :");
		double i =x.nextDouble();
		System.out.print("Enter the width of the rectangle :");
		double j = x.nextDouble();
		b.twopara(i, j);}}
	

