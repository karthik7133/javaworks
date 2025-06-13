package practise;

import java.util.Arrays;

public class ex_1 {
	public static void main(String[] args) {
		int m[]={20,30,40,50,60};
		student s=new student("23bce20022","karthik",21,m);
		double flag=s.calculateAverage();
		s.display();
		if(flag>=50) {
			System.out.println("pass");
		}else System.out.println("failed");
	}
}
class student{
	String studentid;
	String name;
	int age;
	int marks[]=new int [5];
	
	student(String id,String name,int age,int [] marks) {
		this.studentid=id;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("id: "+studentid);
		System.out.println("age: "+age);
		System.out.println("Marks in 5 subs: "+Arrays.toString(marks));
	}
	
	public double calculateAverage() {
		double total=0;
		for(double e:marks) {
			total+=e;
		}return (total/(marks.length));
	}
}
