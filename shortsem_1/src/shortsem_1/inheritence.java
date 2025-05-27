package shortsem_1;
import java.util.*;
public class inheritence {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		base b=new base();
		b.display();
		add a=new add();
		a.setvalues(4, 2);
		a.add();
		mul m=new mul();
		m.setvalues(3, 4);
		m.mul();
		div d =new div();
		d.setvalues(5, 6);
		d.div();
		sub s=new sub();
		s.setvalues(6, 7);
		s.sub();
	}

}
class base{
	public int n1,n2;
	void setvalues(int a,int b) {
		n1=a;
		n2=b;
	}
	void display() {
		System.out.println("value of n1:"+n1);
		System.out.println("value of n2:"+n2);
	}

}
class add extends base{
	void add() {
		int c=n1+n2;
		System.out.println("sum is :"+c);
	}
}
class sub extends base{
	void sub() {
		System.out.println("difference is :"+(n1-n2));
	}
}
class div extends base{
	void div() {
		System.out.println("remainder is :"+(n1/n2));
	}
}
class mul extends base{
	void mul() {
		System.out.println("product is :"+(n1*n2));
	}
}
