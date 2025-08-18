package practise;
import java.util.*;
public class euler_pi {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.print("Enter the target:");
		int n=x.nextInt();
		double temp=n;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				while(n%i==0) n/=i;
				temp*=(1.0-(1.0/i));
			}
		}
		if(n>2)temp*=(1.0-(1.0/n));
		System.out.println((int)temp);
	}
}
