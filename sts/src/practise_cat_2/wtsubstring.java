package practise_cat_2;
import java.util.*;
public class wtsubstring {
	public static void main(String[] args) {
		Scanner x =new Scanner(System.in);
		String  s1=x.next();
		String s2=x.next();
		int k=x.nextInt();
		int n=s1.length();
		wtstring(s1,s2,k,n);
	}
	public static void wtstring(String s1,String s2,int k,int n) {
		HashSet<String> hs=new HashSet<>();
		for(int i=0;i<n;i++) {
			int sum=0;String s="";
			for(int j=i;j<n;j++) {
				int pos=s1.charAt(j)-'a';
				int wt=s2.charAt(pos)-'0';
				s+=s1.charAt(j);sum+=wt;
				if(sum<=k)hs.add(s);
				else break;
			}
		}
		for(String m:hs) {
			System.out.print(m+" ");
		}
	}
}
