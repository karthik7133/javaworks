package fat_practise;
import java.util.*;
public class comb {	
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String s = x.next();
		int n=x.nextInt();
		c(s,0,"",n);
	}
	static void c(String s,int k,String current,int n) {
		if(current.length()==n) {
			System.out.println(current);return;
		}
		for(int i=k;i<s.length();i++) 
			c(s,i+1,current+s.charAt(i),n);
		
	}
}
