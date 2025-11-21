package fat_practise;
import java.util.*;
public class lps {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String s=x.next();
		System.out.print(res(s));
	}
	static String res(String s) {
		int si=0,ei=0;
		for(int i=0;i<s.length();i++) {
			int l1=e(s,i,i);
			int l2=e(s,i,i+1);
			int len=Math.max(l1, l2);
			if(ei-si<len) {
				si=i-(len-1)/2;
				ei=i+len/2;
			}
			
		}return s.substring(si,ei+1);
	}
	static int e(String s,int l,int r) {
		while(l>=0 && r<s.length() && s.charAt(r)==s.charAt(l)) {
			l--;r++;
		}
		return r-l-1;
	}
}