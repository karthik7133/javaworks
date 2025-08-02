package leetcode;

public class remduplicates {
	public static void main(String[] args) {
		int a[]= {1,1,2,2,3,3,3};
		if (a.length <= 2) {
           System.out.println(a.length);
           
        }
		int pos=2;
		int count=0;
		for(int i=2;i<a.length;i++) {
			if(a[i]!=a[pos-2]) {
				a[i]=a[pos];pos++;
			}
		}System.out.println(pos);
	}
}
