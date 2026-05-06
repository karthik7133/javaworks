package practise;
import java.util.*;
public class fabinocci {
	static int[]m;
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		m=new int[n+1];
		Arrays.fill(m, -1);
		m[0]=1;
		m[1]=1;
		f(n);
		for(int i=0;i<n;i++) {
			System.out.print(m[i]+" ");
		}
	}
	static int f(int i) {
		if(i<=1)return 1;
		if(m[i]!=-1)return m[i];
		m[i]=f(i-1)+f(i-2);
		return m[i];
	}
}
