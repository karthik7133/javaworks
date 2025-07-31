package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutations {
	public static void main(String[] args) {
		String a="car";
		List<String> l1=new ArrayList<>();
		l1=genpermutations(a.toCharArray(),0);
		System.out.println(Arrays.toString(l1.toArray(new String [0])));
	}
	private static List<String> genpermutations(char[] charArray, int index) {
		List<String> l1=new ArrayList<>();
		if(index==charArray.length-1) {
			l1.add(String.valueOf(charArray));
			return l1;
		}
		for(int i=index;i<charArray.length;i++) {
			swap(charArray,index,i);
			List<String> perms=genpermutations(charArray,index+1);
			l1.addAll(perms);
			swap(charArray,index,i);
		}return l1;
		
	}
	private static void swap(char[] charArray, int index, int i) {
		char temp=charArray[index];
		charArray[index]=charArray[i];
		charArray[i]=temp;
		
	}
	
}
