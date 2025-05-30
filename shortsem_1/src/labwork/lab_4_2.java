package labwork;

public class lab_4_2 {

}
class calculator{
	public void add(int a,int b) {
		
	}
	public void sub(int a,int b) {
		
	}
	public void mul(int a,int b) {
		
	}
	public void div(float a,float b) {
		
	}
}
class calculate extends calculator{
	public void add(int a,int b ,int c){
		System.out.println("sum :"+(a+b+c));
	}
	public void sub(int a,int b,int c) {
		System.out.println("diff is:"+(a-b-c));
	}
	public void mul(int a,int b ,int c) {
		System.out.println("Product is:"+(a*b*c));
	}
	public void div(double  a,double b) {
		System.out.println("remainder is:"+(a/b));
	}
}
