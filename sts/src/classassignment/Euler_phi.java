package classassignment;

public class Euler_phi {
	public static void main(String[] args) {
		int a=63;double temp=a;
		for(int i=2;i*i<=a;i++) {
			if(a%i==0) {
				while(a%i==0) {
					a/=i;
				}temp=temp*(1.0-(1.0/i));
				
			}System.out.println(i+" ");
		}if(a>2) {
			temp=temp*(1.0-(1.0/a));
			System.out.println(a+" ");

		}
			
		System.out.println((int)temp);
	}
}
