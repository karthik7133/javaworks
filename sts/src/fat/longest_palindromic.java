package fat;
import java.util.*;
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
}
