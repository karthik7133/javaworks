package labwork;
import java.util.*;
public class lab_3 {
	public static void main(String[] args) {
		int a[]=new int[10];
		int b[]= {1,2,3,7,43,42,10,5,89,76};
		String s="  i am porud VITIAN  ";
		
		System.out.println(a.length);
		System.out.println(s.length());
		System.out.println(s.charAt(4));
		System.out.println(s.substring(1,4));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("Trimed version :"+s.trim());
		System.out.println("After replacement:"+s.replace('p', 'd'));
		System.out.println("Does it contain am:"+s.contains("am"));
		System.out.println(s.startsWith(" "));
		System.out.println(s.endsWith(" "));
		
		//System.out.println(s.split(" "));
		lab_3.counter("(()");
		lab_3.longparanthesis("(((((()");
		
		
		
	}
	public static void counter(String a) {
		int len=a.length();
		List<Character> g=new ArrayList<Character>();
		for(char c:a.toCharArray()) {
			g.add(c);
		}
		int count=0;
		for(int i=0;i<len;i++) {
			if(g.get(i)=='(') {
				for(int j=i+1;j<len;j++) {
					if(g.get(j)==')') {
						count++;
						g.remove(j);
						len--;
						break;
					}
						
				}
			}
		}System.out.println(count);
	}
	public static void longparanthesis(String a) {
		int len=a.length();
		List<Character> g=new ArrayList<Character>();
		for(char c:a.toCharArray()) {
			g.add(c);
		}int count=0;
		int start =0;
		int end=0;
		for(int i=0;i<len;i++) {
			if(g.get(i)=='(') {
				start=i;
				for(int j=i+1;j<len;j++) {
					if(g.get(j)==')') {
						end=j;
					}
						
				}break;
			}
		}System.out.println(start+" ,"+end);
		
	}

}

