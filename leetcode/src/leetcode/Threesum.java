package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Threesum {
	public static List<List<Integer>> main(String[] args) {
		int [] b= {2,3,4,5,6};
		Integer a[]= Arrays.stream(b).boxed().toArray(Integer[]::new);;
		Set<List<Integer>> uniqueTriplets = new HashSet<>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i!=j) {
					int n=0-(a[i]+a[j]);
					int k=Arrays.asList(a).indexOf(n);
					if(Arrays.asList(a).contains(n) && k!=i && k!=j) {
						List<Integer> triplet = Arrays.asList(a[i], a[j], a[k]);
						Collections.sort(triplet);
						uniqueTriplets.add(triplet);
					}
				}
			}
		}return new ArrayList<>(uniqueTriplets);
	}
}
