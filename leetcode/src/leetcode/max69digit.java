package leetcode;

public class max69digit {
	public static void main(String[] args) {
		int  n=6969;
		char c[]=String.valueOf(n).toCharArray();
		for(char ch:c) {
			if(ch=='6') {
				ch='9';break;
			}
		}
		String k=String.valueOf(c);
		System.out.println(Integer.valueOf(k));
		
	}
}
