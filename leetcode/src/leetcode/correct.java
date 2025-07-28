package leetcode;

public class correct {
	public static void main(String[] args) {
		String a="leeetcccode";
		char prev=a.charAt(0);
		String b=String.valueOf(prev);
		
		int count=0;
		for(int i=1;i<a.length();i++) {
			char current=a.charAt(i);
			if(prev==current) {
				count++;
				System.out.println("count is:"+count);
				if(count<2)b+=a.charAt(i);
			}else {
				if(count<3)b+=a.charAt(i);
				count=0;
			}prev=current;
		}System.out.println("string is :"+b);
	}
}
