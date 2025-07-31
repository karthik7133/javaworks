package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation_in_string {
	public static void main(String[] args) {
		System.out.println(checkInclusion("ab", "eidboaoo"));
	}

	private static boolean checkInclusion(String string1, String string2) {
		List<String> l1=new ArrayList<>();
		l1=listperms(string1.toCharArray(),0);
		for(int i=0;i<l1.size();i++) {
			if(string2.contains(l1.get(i))) {
				return true;
			}
		}return false; 
		
	}

	private static List<String> listperms(char[] charArray, int i) {
		List<String> l1=new ArrayList<>();
		if(i==charArray.length-1) {
			l1.add(String.valueOf(charArray));
			System.out.println(Arrays.toString(l1.toArray(new String[0])));
			return l1;
		}
		for(int j=i;j<charArray.length;j++) {
			swap(charArray,i,j);
			List<String> perms = listperms(charArray, i + 1);
	        l1.addAll(perms);
			swap(charArray,i,j);
		}return l1;
	}

	private static void swap(char[] charArray, int i, int j) {
		char temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
	}
}
