package leetcode;
import java.util.*;
public class mergeintervels {
	public static void main(String[] args) {
		int[][] intervals = {
			    {1,3},
			    {4,6},
			    {8,10},
			    {15,18}
			};
		List<int []>l= new LinkedList<>();
		int i=intervals[0][0],j=intervals[0][1];
		for(int r[]:intervals) {
			if(r[0]<j && r[1]>j) {
				l.add(new int[] {i,r[1]});
			}else {
				l.add(new int[] {r[0],r[1]});
			}
			i=r[0];j=r[1];
		}for(int [] k:l) {
			System.out.println(Arrays.toString(k));
		}
	}
}
