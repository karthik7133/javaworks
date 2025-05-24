package lab;
import java.util.*;
class CarRental{
	String Rentername;
	double zipcode;
	String size;
	double rentalfee;
	double rentaldays;
	double totalrent;
	CarRental(String Rentarname,double zipcode,String size,double rentaldays){
	}
	public  void display (String Rentarname,double zipcode,String size,double rentaldays) {
		String rn = Rentarname;
		double zi = zipcode;
		String s = size;
		double re = rentaldays;
		System.out.println("Name is :"+rn);
		System.out.println("Zipcode is :"+zi);
		System.out.println("Size is :"+s);
		System.out.println("Rental days is :"+re);
	}
	public double fee(String size) {
		if(size.equalsIgnoreCase("economy")){
			rentalfee=29.99;
		}else if(size.equalsIgnoreCase("midsize")){
			rentalfee=38.99;
		}else if (size.equalsIgnoreCase("fullsize")) {
			rentalfee =43.50;
		}return(rentalfee);
	}
}
class LuxuryCarRental extends CarRental{
	LuxuryCarRental(String Rentarname, double zipcode, String size, double rentaldays) {
		super(Rentarname, zipcode, size, rentaldays);
	}
	double drive(String k){
		double rentalfee;
		if (k.equalsIgnoreCase("yes")) {
			 rentalfee =79.99+200;
		}else {
			 rentalfee =79.99;
		}
	return(rentalfee);}
	public  void display (String Rentarname,double zipcode,String size,double rentaldays) {
		String rn = Rentarname;
		double zi = zipcode;
		String s = size;
		double re = rentaldays;
		System.out.println("Name is :"+rn);
		System.out.println("Zipcode is :"+zi);
		System.out.println("Size is :"+s);
		System.out.println("Rental days is :"+re);
	}}
public class UseCarRenter{
	static Scanner x = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter name :");
		String Rentername =x.next();
		System.out.print("Enter zipcode :");
		double zipcode = x.nextDouble();
		System.out.println("1.Economy \n2.midsize \n3.fullsize \n4.luxury");
		System.out.print("Enter size full name :");
		String size =x.next();
		double totalrentalfee;
		double rentalfee;
		System.out.print("Enter rental days :");
		double rentaldays=x.nextDouble();
		CarRental b = new CarRental(Rentername,zipcode , size, rentaldays);
		LuxuryCarRental k = new LuxuryCarRental(Rentername,zipcode , size, rentaldays);
		rentalfee=b.fee(size);
		if (size.equalsIgnoreCase("luxury")) {
			System.out.println("do you need driver enter yes or no ?");
			String k1 = x.next();
			double rentalfeelux =k.drive(k1);
			k.display(Rentername,zipcode , size, rentaldays);
			totalrentalfee = rentalfeelux *rentaldays;
			System.out.print("fee is :"+totalrentalfee);
		}else {
			b.display(Rentername,zipcode , size, rentaldays);
			System.out.print("fee is :"+rentalfee*rentaldays);}
	}}

