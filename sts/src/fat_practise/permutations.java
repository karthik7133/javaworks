package fat_practise;
import java.util.*;
public class permutations {
	static HashSet<String> set=new HashSet<>();
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String s=x.next();
		p(s,"");
		System.out.println("Number of permutations: "+set.size());
		for(String k:set) {
			System.out.print(k+" ");
		}
	}
	static void p(String s,String ans) {
		if(s.length()==0) {
			set.add(ans);return;
		}
		for(int i=0;i<s.length();i++) {
			String r=s.substring(0,i)+s.substring(i+1);
			p(r,ans+s.charAt(i));
		}
	}
}
