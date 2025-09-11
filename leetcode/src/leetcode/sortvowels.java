package leetcode;
import java.util.*;
public class sortvowels {
	public static void main(String[] args) {
		String a= "kirthak";
		List <Character > l= new ArrayList<>();
		for(int i=0;i<a.length();i++) {
			char c=Character.toLowerCase(a.charAt(i));
			if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u') {
				l.add(a.charAt(i));
			}
		}Collections.sort(l);
		String b="";int co=0;
		for(int i=0;i<a.length();i++) {
			char c=Character.toLowerCase(a.charAt(i));
			if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u') {
				b+=l.get(co++);
			}else b+=a.charAt(i);
		}
		System.out.println(Arrays.toString(l.toArray()));
		System.out.println(b);
		
	}
}
