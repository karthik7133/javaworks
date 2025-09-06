package classassignment;

import java.util.Arrays;

public class segmentedsieve {
	public static void main(String[] args) {
		int h=5;
		int l=1;
		boolean []b=new boolean[h-l+1];
		
	
		for(int i=2;i<=Math.sqrt(h);i++) {
			int sm = Math.max(i * i, ((l + i - 1) / i) * i);
			if(sm<l)sm+=i;
			
			for(int j=sm;j<=h;j+=i) {
				b[j-l]=true;
			}
		}
		System.out.println(Arrays.toString(b));
		for(int i=0;i<h-l+1;i++) {
			if (!b[i] ) {
				if((l+i)!=1) {
					System.out.print((l + i) + " ");
				}
                
            }
		}
	}
}
