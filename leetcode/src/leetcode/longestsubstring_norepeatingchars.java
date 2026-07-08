package leetcode;
import java.util.*;
public class longestsubstring_norepeatingchars {
	public static void main(String[] args) {
		String a="karthik";
		int l=0;
		if(a.isEmpty()) {
			System.out.println(0);return;
		}
		int r=l+1,total=0,iter=1;
		HashSet<Character>set=new HashSet<>();
		set.add(a.charAt(l));
			while(r < a.length()){

			    if(!set.contains(a.charAt(r))){
			        set.add(a.charAt(r));
			        total = Math.max(total, r-l+1);
			        r++;
			    }
			    else{
			        set.remove(a.charAt(l));
			        l++;
			    }
			}
		System.out.println(total);
	}
}
