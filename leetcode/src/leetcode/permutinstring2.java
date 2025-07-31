package leetcode;

import java.util.Arrays;

public class permutinstring2 {
	public static void main(String[] args) {
		System.out.println(checkInclusion( "ab",  "eidboaoo"));
	}

	private static boolean checkInclusion(String s1, String s2) {
		if (s1.length() > s2.length()) return false;
		int count1[]=new int[26];
		int count2[]=new int[26];
		for(int i=0;i<s1.length();i++) {
			count1[s1.charAt(i)-'a']++;
			count2[s2.charAt(i)-'a']++;
		}
//		System.out.println(Arrays.toString(count2));
		
		for(int i=0;i<s2.length()-s1.length();i++) {
			if (Arrays.equals(count1, count2)) return true;
			if(i+s1.length()<s2.length()) {
				count2[s2.charAt(i) - 'a']--;  
				count2[s2.charAt(i + s1.length()) - 'a']++;
			}
		}
		return false;
	}
}
