package fat;
/*import java.util.*;
//t.c and s.c
//efficient =>center expansion with mirrors
//in code questions

public class longest_palindromic {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		String a=x.next();
		String c="";
		for(int i=0;i<=2*a.length();i++) {
			if(i%2==0)c+="#";
			else c+=a.charAt(i/2);
		}
		System.out.println(lps(c,a));
	}
	static String lps(String c,String a) {
		char ch[]=c.toCharArray();
		int n=ch.length;
		int p[]=new int[ch.length];
		int ml=0,ci=0;
		for(int i=0;i<ch.length;i++) {
			p[i]=0;
			while(i+p[i]+1<n&&i-p[i]-1>=0&&ch[i+p[i]+1]==ch[i-p[i]-1]) {
				p[i]++;
			}
			if(p[i]>ml) {
				ml=p[i];	
				ci=i;
			}
		}int si=(ci-ml)/2;
		return a.substring(si,si+ml);
	}
}*/
import java.util.*;

public class longest_palindromic {
    public static void main(String ar[]) {
        Scanner x = new Scanner(System.in);
        String a = x.next();
        String result = longestPalindrome(a);
        System.out.println("Length: " + result.length());
        System.out.println("Substring: " + result);
    }
    
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int start = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);      // Odd length
            int len2 = expandAroundCenter(s, i, i + 1);  // Even length
            int len = Math.max(len1, len2);
            
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
 
