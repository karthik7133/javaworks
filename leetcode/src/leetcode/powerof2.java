package leetcode;

public class powerof2 {
	public static void main(String[] args) {
		int n=20;
		if(n%2==0) {
			while(n%2==0) {
				n/=2;
			}
		}
		if(n==1) {
			System.out.println("yes");
		}else System.out.println("no");
	}
}
