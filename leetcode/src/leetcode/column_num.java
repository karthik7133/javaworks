package leetcode;

public class column_num {
	public static void main(String[] args) {
		int n=701;
		int count=0;
		while(n>26) {
			count++;
			n/=26;
		}
		System.out.println(count);
	}
}
