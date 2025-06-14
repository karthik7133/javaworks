package practise;

import java.util.ArrayList;
import java.util.List;

public class ex_9 {
	public static void main(String[] args) {
		
		singers s[]=new singers[5];
		s[0]=new singers("karthik","nellore","1234",20);
		singers.count(s);
		singers.search("1234", s);
	}

}
abstract class singingcompetition{
	abstract void readdetails();
	abstract void displayvenue();
	
}
class singers extends singingcompetition{
	String name,livingcity,singerid;
	int age;
	singers(String n,String b,String c,int age){
		this.name=n;
		this.livingcity=b;
		this.singerid=c;
		this.age=age;
	}
	@Override
	void readdetails() {
		
		
	}

	@Override
	void displayvenue() {
		
		
	}
	public static  void search(String id,singers []a) {
		boolean flag=false;
		for(singers s:a) {
			if(s!=null) {
				if(s.singerid==id) {
					System.out.println("Name:"+s.name+"\nLivingCity :"+s.livingcity+"\nSingerid:"+s.singerid
							+"\nAge :"+s.age);
					flag=true;
					break;
				}
			}
			
		}
		if(!flag) {
			System.out.println("id not found!");
		}
	}
	public static void count(singers [] a) {
		int count=0;
		for(singers s:a) {
			if(s!=null)
				if(s.age>30)count++;
		}System.out.println("singers count of age>30 :"+count);
	}
	
}
