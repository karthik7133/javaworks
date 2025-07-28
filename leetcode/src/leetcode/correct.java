package leetcode;

public class correct {
	public static void main(String[] args) {
		String a="leetcode";
		StringBuilder b = new StringBuilder();
		if (a == null || a.isEmpty()) {
		    System.out.println("string is :" + a);
		    return;
		}
		b.append(a.charAt(0));

		for (int i = 1; i < a.length(); i++) {
		    char current = a.charAt(i);
		    int bLength = b.length();
		    if (bLength >= 2 && b.charAt(bLength - 1) == current && b.charAt(bLength - 2) == current) {
		        continue;
		    }
		    b.append(current);
		}
		System.out.println("string is :" + b.toString());
	}
}
