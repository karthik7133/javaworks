package leetcode;

public class regularexp {
	public static void main(String[] args) {
		String a="ab";
		String p=".*";
		if(a.matches(p)) {
			System.out.println("ture");
		}
		else System.out.println("False");
	}
}
