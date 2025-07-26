package leetcode;
import java.util.*;
public class startendindex {
	public static void main(String[] args) {
		HashMap<Character ,Integer> map=new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		String a="IX";
		int sum=0;
		int prev=0;
		for(int i=a.length()-1;i>=0;i--) {
			int current=map.get(a.charAt(i));
			if( current<prev) {
				sum-=current;
			}
			else {
				sum+=current;
			}prev=map.get(a.charAt(i));
		}
		System.out.println(sum);
		
	}
}
