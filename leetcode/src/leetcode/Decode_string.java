package leetcode;

public class Decode_string {
	public static void main(String[] args) {
		String s= "3*[a]4*[bdc]";
		int l=0;String res="";String sa="";
		while(l<s.length()) {
			char c = s.charAt(l);
			if(Character.isDigit(c)) {
				int r=Character.getNumericValue(s.charAt(l));
				l++;
				if(s.charAt(l)=='*') {
					l++;
				}
				if(s.charAt(l)=='[') {
					l++;
					sa="";
					while(s.charAt(l)!=']') {
						sa+=s.charAt(l);
						l++;
					}
				}
				res+=append(r,sa);
				l++;
			}else l++;
			
		}
		System.out.println(res);
	}
	static String append(int r,String a) {
		String s="";
		for(int i=0;i<r;i++) {
			s+=a;
		}return s;
	}
	
}
