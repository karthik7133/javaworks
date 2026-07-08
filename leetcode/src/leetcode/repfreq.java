package leetcode;
import java.util.*;
import java.util.Map.Entry;
public class repfreq {
	public static void main(String[] args) {
		int a[]= {1,1,1,1,2,3,3,3,3};
		TreeMap<Integer,Integer>m= new TreeMap<>();
		for(int i:a) {
			//m.putIfAbsent(i, 0);
			m.put(i, m.getOrDefault(i, 0)+1);
		}
		m.entrySet()
		 .stream()
		 .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		 .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
		for(Entry<Integer, Integer> e:m.entrySet()) {
			System.out.print(e.getKey());
		}
	}
}
