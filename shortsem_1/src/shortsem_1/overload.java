package shortsem_1;

public class overload {
	public static void main(String[] args) {
		kar k =new kar();
		System.out.println(k.sum(653854554, 3));
		
	}
	
}
class kar{
	public int sum(int a,int b) {
		System.out.println("int data type");
		
		return a+b;
		
	}
	long sum(long a,long b) {
		System.out.println("data type is long");
		return a+b;
	}
	double sum(double a,double b) {
		System.out.println("double is the data type");
		return a+b;
	}
	float sum(float a,float b) {
		System.out.println("data type is float");
		return a+b;
	}
}
