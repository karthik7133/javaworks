package shortsem_1;

public class exception {
	public static void main(String[] args) {
		int a[]=new int[4];
		try {
			System.out.println(a[5]);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("I am safe");
		}
		
		System.out.println("Hello i am karthik");
		b b=new b();
		b.argumentsexcp(-4);
		
		
	}

}
class b{
	public void argumentsexcp(int a) {
		try {
			if (a<0){
				throw new IllegalArgumentException("Negative numbs are not allowed!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
