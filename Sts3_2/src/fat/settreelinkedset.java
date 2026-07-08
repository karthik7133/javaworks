package fat;
import java.util.*;
public class settreelinkedset {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		//int n=x.nextInt();
		HashSet<String> s=new HashSet<>();
		LinkedHashSet<String >ls=new LinkedHashSet<>();
		TreeSet<String >ts=new TreeSet<>();
		s.add("apple");
		s.add("organge");
		s.add("mango");
		ts.add("kaja");
		ts.add("mango");
		HashSet<String>in=new HashSet<>(s);
		in.retainAll(ts);
		HashSet<String>u=new HashSet<>(s);
		u.addAll(ts);
		HashSet<String>d=new HashSet<>(s);
		d.removeAll(ts);
		System.out.print("Intersection:\n");
		for(String m:in) {
			System.out.println(m);
		}
		System.out.print("\nunion:\n");
		for(String m:u) {
			System.out.println(m);
		}
		System.out.print("\nDifference:\n");
		for(String m:d) {
			System.out.println(m);
		}
		
		
	}
}
