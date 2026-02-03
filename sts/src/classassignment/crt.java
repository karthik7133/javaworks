package classassignment;
import java.util.*;
//x=2 mod 5 x=1 mod 7 x=22 or modular inverse or M value
//t.c and s.c
//modulo arithmetic usage or application of crt(purpose).
public class crt {
	public static void main(String[] args) {
		Scanner x =new Scanner(System.in);
		int n= x.nextInt();
		int a[]=new int[n];
		int m[]=new int[n];
		int M=1;
		for(int i=0;i<n;i++) {
			a[i]=x.nextInt();
			m[i]=x.nextInt();
			M*=m[i];
		}
		for(int i=0;i<n;i++) {
			if(GDC(m[i%n],m[(i+1)%n])!=1 | a[i]>m[i]) {
				System.out.println("no sol");return;
			}
		}
		int y=0;
		for(int i=0;i<n;i++) {
			int Mi=M/m[i];
			int minv=1;
					for(int j=1;j<m[i];j++) {
						if((Mi*j)%m[i]==1) {
							minv=j;break;
						}
					}
					y+=(a[i]*Mi*minv);
		}
		System.out.println(y%M);
	}
	private static int GDC(int a, int b) {
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
			
		}return a;
	}
	
}
