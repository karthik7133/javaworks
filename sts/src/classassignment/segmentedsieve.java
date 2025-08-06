package classassignment;

public class segmentedsieve {
	public static void main(String[] args) {
		int h=4;
		int l=2;
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
