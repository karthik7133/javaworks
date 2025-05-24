package javapractise;
import java.util.*;
public class InventoryManagement{
	static Scanner k1 = new Scanner(System.in);
	public static void main(String[] args)  {
		Employee e = new Employee("Karthik",2002,50000);
		System.out.println(e.setname("King"));
		e.display();
	}
}
class Employee{
	private String name;
	private int id;
	private int salary;
	Employee(String name,int id ,int salary){
		this.name= name;
		this.id = id;
		this.salary = salary;
	}public String setname( String name) {
		this.name = name;
		return name;
	}public int setid(int id ) {
		return id;
	}public int setsalary(int salary) {
		return salary;
	}public void display() {
		System.out.println("Name of employee is :"+name +"\nEmployee id is :"+id+"\nemployee salary is:"+salary);
	}
}

