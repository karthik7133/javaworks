package classassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Euler_phi {
	public static void main(String[] args) {
		int a=10;int temp=a;
		List<Integer> l=new ArrayList<Integer>();
		if(a%2==0) {
			l.add(2);
			while(a%2==0) {
				a/=2;
			}
		}
		for(int i=3;i<Math.sqrt(temp);i+=2) {
			if(a%i==0) {
				l.add(i);
				while(a%i==0) {
					a/=i;
				}
			}
		}if(a>2)l.add(a);
		System.out.println(Arrays.toString(l.toArray()));
		for(int j:l) {
			temp*=(1.0-(1.0/j));
		}
		System.out.println(temp);
	}
}
