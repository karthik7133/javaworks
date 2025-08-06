package classassignment;

public class segmentedsieve {
	public static void main(String[] args) {
		int h=11;
		int l=1;
		int a[]= {2,3,5,7};
		if(l<=7) {
			for(int i :a ) {
				if(h>i && i>=l)System.out.println(i);break;
			}
			
		}
		boolean []b=new boolean[h-l+1];
		for(int i=2;i<=Math.sqrt(h);i++) {
			int sm=(l/i)*i;
			if(sm<l)sm+=i;
			
			for(int j=sm;j<=h;j+=i) {
				b[j-l]=true;
			}
		}
		for(int i=2;i<h-l+1;i++) {
			if(b[i]==false) {
				System.out.print(l+i+" ");
			}
		}
	}
}
