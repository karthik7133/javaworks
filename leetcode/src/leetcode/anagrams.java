package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class anagrams {
	public static void main(String[] args) {
        String[] words = {"karthik", "ikhar", "khra", "abc", "bca", "xyz", "ace", "b"};
        Map<String, List<String>> map = new HashMap<>();

        for (String s : words) {
            String sortedString = sortString(s);
            
            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(s);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                map.put(sortedString, newList);
            }
        }
        
        List<List<String>> result = new ArrayList<>(map.values());
        System.out.println(result);
    }
    
    public static String sortString(String s) {
        char[] characters = s.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }
}
