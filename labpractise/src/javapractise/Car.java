package javapractise;
import java.util.*;
class Car {
	static Scanner x = new Scanner(System.in);
	public static void main(String[] args){
	System.out.print("Enter your name "+"\nzipcode"+"\nno of days");
	String n=x.next();
	int zip=x.nextInt();
	int days=x.nextInt();
	System.out.print("Enter the size of the car:");
	String size=x.next();
	CarRental k = new CarRental(n,zip,size,days);
	LuxurycarRental l= new LuxurycarRental(n,zip,size,days);
	if(size.toLowerCase().equals("luxury")){
	l.display();
	System.out.print("do you need driver ?");
	String yn=x.next();
	l.totalfeecalc(yn);}
	else{
	k.display();
	k.sizecalc();
	k.totalcalc();
	}
	
	}
}
class CarRental{
	
	String n;
	int z;
	String s;
	double drf;
	int nodays;
	double totalfee;
	CarRental(String na,int zip,String size ,int days){
		n=na;
		z=zip;
		s=size;
		nodays=days;
	}
	public void sizecalc(){
	switch (s.toLowerCase()){
	case "economy":
	drf=29.99;
	case "midsize":
	drf=38.99;
	case "fullsize":
	drf = 43.50;
	
	break;
}System.out.print("DAily rental fee is :"+drf);
	}
	public void totalcalc(){
	
	totalfee=nodays*drf;
	System.out.print("Total fee is :"+totalfee);
}
	
	public void display(){
	System.out.print("name is :"+n +"\nZipcode is :"+z+"\nSize is :"+s+"\nrental days are:"+nodays+"\nDaily rental fee is :"+drf+"\nTotal fee is :"+totalfee);}
}
class LuxurycarRental extends CarRental{
	int driverfee=200;
	LuxurycarRental(String na, int zip, String size, int days) {
		super(na, zip, size, days);
	}
	public void totalfeecalc(String y){
	totalfee=79.99*nodays;
	if (y.equalsIgnoreCase("yes")){
	totalfee=79.99*nodays+200;}
	System.out.println("daily rental fee :"+79.99);
	System.out.print("total fee is :"+totalfee);
}
	
	@Override
	public  void display(){
	System.out.print("name is :"+n +"\nZipcode is :"+z+"\nSize is :"+s+"\nrental days are:"+nodays+"\nDriver fee :"+driverfee+"\n");
	
	}	
}
