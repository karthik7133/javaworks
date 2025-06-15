package practise;
import java.util.*;
public class ex_16{
	public static void main(String[] args) throws InterruptedException {
		Employeedetails e =new Employeedetails("A","123",2000,"Dept1");
//		Thread t1=new Thread(()->e.display());
//		Thread t2=new Thread(()->e.checkname());
//		
//		t1.start();
//		t2.start();
//		t1.join();
//		t2.join();
		mythread1 t1 =new mythread1();
		t1.start();
		
	}

}
class Employeedetails{
	String name,id;
	double salary;
	String dept;
	Employeedetails(String n,String i,double s,String d){
		this.name=n;
		id=i;
		salary=s;
		dept=d;
	}
	public void checkname() {
		if(name.toLowerCase().contains("a"))System.out.println("\nValied name");
		else System.out.println("\nnot a valied name!");
	}
	public void display() {
		System.out.printf("Name is:%s \nsalary:%.2f \nid:%s \nDept: %s",name,salary,id,dept);
	}
}
class mythread1 extends Thread{
	public void run() {
		Employeedetails e =new Employeedetails("A","123",2000,"Dept1");
		e.checkname();
	}
}


