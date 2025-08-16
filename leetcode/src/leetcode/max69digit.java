package leetcode;

public class max69digit {
	public static void main(String[] args) {
		int  n=6969;
		char c[]=String.valueOf(n).toCharArray();
		for( int i=0 ;i<c.length;i++) {
			if(c[i]=='6') {
				c[i]='9';break;
			}
		}
		String k=String.valueOf(c);
		System.out.println(Integer.valueOf(k));
		
	}
}
