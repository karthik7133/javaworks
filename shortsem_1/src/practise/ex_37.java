package practise;
import java.util.*;
public class ex_37 {
	public static void main(String[] args) {
		String arr[]= {"22","50","aker","101"};
		List<Integer> l=new ArrayList<>();
		List l1=new ArrayList<>();
		for(String s :arr) {
			if(s.matches("\\d+")) {
				if(Integer.valueOf(s)<=100 & Integer.valueOf(s)>=0) {
					l.add(Integer.valueOf(s));
				}else l1.add(s);
			}else l1.add(s);
		}
		System.out.println(Arrays.toString(l.toArray()));
		for(Object o:l1) {
			System.out.println(o.toString());
		}
	}
}
