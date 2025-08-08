package classassignment;

public class Euler_phi {
	public static void main(String[] args) {
		int a=500;double temp=a;
		if(a%2==0) {
			while(a%2==0) a/=2;
			temp=temp*(1.0-(1.0/2.0));
		}
		for(int i=3;i*i<=a;i+=2) {
			if(a%i==0) {
				while(a%i==0) {
					a/=i;
				}temp=temp*(1.0-(1.0/i));
			}
		}if(a>2) 
			temp=temp*(1.0-(1.0/a));

		System.out.println((int)temp);
	}
}
