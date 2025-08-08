package leetcode;
public class longestsubstring {
	public static void main(String[] args) {
		String a="abcabcbb";
		int count=0;int max=0;
		a.toLowerCase();
		for(int i=1;i<a.length();i++) {
			if(a.charAt(i-1)!=a.charAt(i)) {
				count++;if(count>max)max=count;
			}else count=0;
			
		}System.out.println(max+1);
	}
}
