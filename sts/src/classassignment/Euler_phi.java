package classassignment;

public class Euler_phi {
	public static void main(String[] args) {
		int a=63;double temp=a;
		for(int i=2;i*i<=a;i++) {
			if(a%i==0) {
				while(a%i==0) {
					a/=i;
				}temp-=temp/i;
				
			}
		}if(a>1) {
			temp-=temp/a;

		}
			
		System.out.println((int)temp);
	}
}
