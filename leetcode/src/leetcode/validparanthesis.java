package leetcode;
import java.util.*;
public class validparanthesis {
	public static void main(String[] args) {
		String p="{}[]()";
		char a[]= p.toCharArray();
		Stack<Character>s = new Stack<>();
		for(char c :a) {
			if(c=='(' || c=='{' || c=='[')s.push(c);
			else if(c==']') {
				if(!s.isEmpty() && s.peek()=='[')s.pop();
			}
			else if(c==')') {
				if(!s.isEmpty() && s.peek()=='(')s.pop();
			}
			else if(c=='}') {
				if(!s.isEmpty() && s.peek()=='{')s.pop();
			}
		}System.out.print(s);
		System.out.print(s.isEmpty());
	}
}
