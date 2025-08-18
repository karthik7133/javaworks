package classassignment;

public class segmentedsieve {
	public static void main(String[] args) {
		int h=11;
		int l=1;
		boolean []b=new boolean[h-l+1];
		for(int i=2;i<=Math.sqrt(h);i++) {
			int sm = Math.max(i * i, ((l + i - 1) / i) * i);
			if(sm<l)sm+=i;
			
			for(int j=sm;j<=h;j+=i) {
				b[j-l]=true;
			}
		}
		for(int i=1;i<h-l+1;i++) {
			if (!b[i] ) {
                System.out.print((l + i) + " ");
            }
		}
	}
}
