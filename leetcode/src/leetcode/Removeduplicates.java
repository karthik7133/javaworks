package leetcode;

public class Removeduplicates {
	public static void main(String[] args) {
		int a[]= {1,1,2,2,3,4};
		int c=1;
		for(int i=0;i<a.length;i++) {
			if(a[c-1]!=a[i]) {
				a[c]=a[i];
				c++;
			}
		}System.out.println("count :"+c);
	}
}
