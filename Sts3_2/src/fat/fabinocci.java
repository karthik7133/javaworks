package fat;
import java.util.*;
public class fabinocci {
	static int m[];
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		m=new int[n+1];
		Arrays.fill(m, -1);
		m[0]=1;
		m[1]=1;
		
		f(n);
		for(int i=0;i<n;i++)System.out.print(m[i]+" ");
	}
	static int f(int n) {
		if(m[n]!=-1)return m[n];
		if(n<=1)return 1;
		m[n]=f(n-1)+f(n-2);
		return m[n];
	}
}
