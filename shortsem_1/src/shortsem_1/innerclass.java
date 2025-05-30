package shortsem_1;

public class innerclass {
	public void add(int a,int b) {
		System.out.println("SUM is:" +(a+b));
	}
	class child{
		public void sub(int a,int b) {
			System.out.println("Diff is:"+(a-b));
		}
	}
	static class child2{
		public void mul(int a,int b) {
			System.out.println("product is:"+(a*b));
		}
	}
	public void div(int a,int b) {
		class localinner{
			public void div(){
				System.out.println("remainder is:"+(a/b));
			} 
			
		}localinner li=new localinner();
		li.div();
	}
	operator add =new operator() {

		@Override
		public int add2(int a, int b) {
			System.out.println("sum of Anonymous  class:"+(a+b));
			return 0;
		}
		
	};
	public static void main(String[] args) {
		innerclass in=new innerclass();
		in.add(3, 6);
		innerclass.child c=in.new child();
		c.sub(2, 1);
		innerclass.child2 c2=new child2();
		c2.mul(3, 4);
		in.div(4, 2);
		in.add.add2(3, 5);
		
		
	}

}
interface operator{
	public abstract int add2(int a,int b);
}

