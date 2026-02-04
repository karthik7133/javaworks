package practise;
import java.util.*;
public class stper {
	public static void main(String[] args) {
		int[] input = {1, 2, 3}; int[] output1 = {3,2,1};  int[] output2 = {3, 1, 2};
		System.out.println(isper(input,output2));
	}
	static boolean isper(int a[],int b[]) {
		int j=0;
		Stack<Integer>s = new Stack<>();
		for(int i=0;i<a.length;i++) {
			s.push(a[i]);
			while(!s.isEmpty() && s.peek()==b[j]) {
				s.pop();
				j++;
			}
		}return s.isEmpty();
	}
}
