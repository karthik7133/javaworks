package leetcode;
import java.util.*;
public class minsubarray {
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,5,10};
		int t=10;
		List<Integer>c=new ArrayList<>();
		List<List<Integer>>res=new ArrayList<>();
		s(a,t,a.length-1,c,res);
		System.out.println(res);
	}
	static void s(int a[],int t,int l,List<Integer> c,List<List<Integer>>res) {
		if(t==0) {
			if(c.size()<min) {
				min=c.size();
				res.clear();
			}
			res.add(new ArrayList<>(c));
			return;
		}
		if(l<0)return;
		s(a,t,l-1,c,res);
		if(a[l] <= t) {
			c.add(a[l]);
			s(a,t-a[l],l-1,c,res);
			c.remove(c.size()-1);
		}
	}
}
