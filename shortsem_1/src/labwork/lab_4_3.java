package labwork;

public class lab_4_3 {
	public static void main(String[] args) {
		calcu c=new calcu();
		calcu c1=new calcu(3,4);
		calcu c2=new calcu(3,4,"karthik");
		
	}
}
class calcu{
	int a;
	int b;
	String c;
	calcu(){
		this.a=0;
		this.b=0;
		System.out.println("value of a:"+a +"\nvalue of b:"+b);
	}
	calcu(int a ,int b){
		this.a=a;
		this.b=b;
		System.out.println("value of a:"+a +"\nvalue of b:"+b);
		System.out.println("SUM is:"+a+b);
	}
	calcu(int a,int b,String s){
		this.a=a;
		this.b=b;
		c=s;
		System.out.println("value of a:"+a +"\nvalue of b:"+b+"\nvalue of string is:"+c);
	}
}
