package leetcode;
import java.util.*;
public class lonelynumber {
	public static void main(String[] args) {
		int a[]= {10,6,5,8};
		HashMap<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<a.length;i++)map.put(a[i], map.getOrDefault(a[i],0)+1);
		for(int i:a) {
			if(map.get(i)==1 && !(map.containsKey(i-1) ||map.containsKey(i+1) )){
				System.out.println(i);
			}
		}
	}
}
