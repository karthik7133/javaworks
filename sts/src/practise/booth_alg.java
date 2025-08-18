package practise;
import java.util.*;
public class booth_alg {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int res=booth(2,3);
		System.out.println(res);
	}
	public static int booth(int a,int b) {
		int len=Integer.toBinaryString(a).length();
		int p=0;
		for(int i=0;i<len;i++) {
			if((a&1)==1) {
				p+=b;
			}
			a>>=1;
			b<<=1;
		}return p;
	}
}
