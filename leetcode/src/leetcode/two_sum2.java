package leetcode;

import java.util.HashMap;

public class two_sum2 {
	public static void main(String[] args) {
		int a[]= {2,7,11,15};
		int target=9;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			int comp=9-a[i];
			if (map.containsKey(comp)){
				System.out.println(map.get(comp)+" "+i);break;
			}else {
				map.put(a[i], i);
			}
		}
	}
}
