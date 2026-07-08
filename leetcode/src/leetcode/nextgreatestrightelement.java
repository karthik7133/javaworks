package leetcode;
import java.util.*;
public class nextgreatestrightelement {
	public static void main(String[] args) {
		int a[]= {73,74,75,71,69,72,76,73};
		Stack<Integer>s = new Stack<>();
		int ans[]= new int[a.length];
		for(int i=a.length-1;i>=0;i--) {
			while(!s.isEmpty() && a[i]>=a[s.peek()]) {
				s.pop();
			}
			if(s.isEmpty()){
			    ans[i]=0;
			}
			else{
			    ans[i]=s.peek()-i;
			}
			s.push(i);
			
		}System.out.print(Arrays.toString(ans));
	}
}
