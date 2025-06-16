package practise;
import Education.*;
public class ex_32 {
	public static void main(String[] args) {
		OnlineCourse o=new OnlineCourse("A",3,200.00,true);
		o.display();
		System.out.println(o.claculateCourseFee());
	}
}

