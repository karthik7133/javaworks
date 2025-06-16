package practise;

public class ex_30 {
	public static void main(String[] args) {
		student1 s1=new student1();
		s1.borrowitem();
		s1.borrowitem();
		s1.borrowitem();
	}
}
class libraryuser{
	String userid;
	String name;
	public void borrowitem() {
		
	}
}
class student1 extends libraryuser{
	int borrowlimit=2;
	public void borrowitem() {
		if(borrowlimit>0) {
			System.out.println("borrow successfull");
			borrowlimit--;
			
		}else {
			System.out.println("Exceeded borrow limit!");
		}
	}
}
class faculty extends libraryuser{
	int borrowlimit=3;
	public void borrowitem() {
		if(borrowlimit>0) {
			System.out.println("borrow successfull");
			borrowlimit--;
			
		}else {
			System.out.println("Exceeded borrow limit!");
		}
	}
}
class guest extends libraryuser{
	int borrowlimit=4;
	public void borrowitem() {
		if(borrowlimit>0) {
			System.out.println("borrow successfull");
			borrowlimit--;
			
		}else {
			System.out.println("Exceeded borrow limit!");
		}
	}
}
