package dsa;

import java.util.*;

public class hello {
	public static void main(String[] args) {
		String s="aaacaaa";
		int u=0;int l=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j)))
            u=Math.max(map.get(s.charAt(j)),u);
            l=Math.max(l,j-u+1);
            map.putIfAbsent(s.charAt(j),j+1);
        }
		
	}
}
