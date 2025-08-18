package practise;
import java.util.*;
public class sieve {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.print("Enter up to where you wanna find primes:");
		int ul=x.nextInt();
		boolean b[] =new boolean[ul+1];
		for(int i=2;i*i<=ul;i++) {
			if(b[i]==true) {
				continue;
			}else {
				for(int j=i*i;j<=ul;j+=i) {
					b[j]=true;
				}
			}
		}
		for(int i=2;i<=ul;i++) {
			if(b[i]==false)System.out.println(i);
		}
	}
}
