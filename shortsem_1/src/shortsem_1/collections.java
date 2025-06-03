package shortsem_1;
import java.util.*;
public class collections {
	public static void main(String[] args) {
		int sum=0;
		List<Integer> m=new ArrayList<>();
		m.add(20);
		m.add(45);
		m.add(46);
		m.add(50);
		for(int i=0;i<m.size();i++) {
			sum+=m.get(i);
		}
		System.out.println("avg: "+(sum/4.0));
	}

}
