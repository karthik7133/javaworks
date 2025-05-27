package shortsem_1;

public class superclass {
	public static void main(String[] args) {
		child c=new child(5,6);
		c.add();
		
		
	}
	

}
class parent{
	int a;int b;
	parent (int a,int b){
		this.a=a;
		this.b=b;
	}
	void add() {
		System.out.println("a and b are:"+a+" "+b);
		System.out.println("sum is:"+(a+b));
	}
}
class child extends parent{
	child(int a,int b){
		super(a,b);
	}
	 public int method() {
		return a+b;
	}
	 void add() {
		 System.out.println("this is child method");
	 }
}
