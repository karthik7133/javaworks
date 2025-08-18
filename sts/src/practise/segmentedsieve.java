package practise;
import java.util.*;
public class segmentedsieve {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the limits :");
		int l=x.nextInt();int h=x.nextInt();
		boolean b[]=new boolean[h-l+1];
		for(int i=2 ;i*i<=h;i++) {
			int sm=Math.max(i*i, ((l+i-1)/i)*i);
			for(int j=sm;j<=h;j+=i) {
				b[j-l]=true;
			}
		}
		for(int i=1;i<h-l+1;i++) {
			if(!b[i])System.out.println(l+i+" ");
		}
	}
}
