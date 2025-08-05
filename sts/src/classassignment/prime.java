package classassignment;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.print("enter n value:");
		int n=x.nextInt();
		boolean[] b=new boolean[n+1];
		for(int i=2;i<Math.sqrt(n);i++) {
			if(b[i]==true) {
				continue;
			}else {
				for(int j=i*i;j<=n;j+=i) {
					b[j]=true;
				}
			}
			
		}
		for(int i=2;i<=n;i++) {
			if(b[i]==false) {
				System.out.print(i+" ");
			}
		}
	}
}
