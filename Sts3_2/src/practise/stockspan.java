package practise;

import java.util.*;

public class stockspan {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int prices[]={100,80,60,40,90};
        int[] span = calculateSpan(prices);
         System.out.print("Stock spans: ");
          for (int s : span) {
            System.out.print(s + " "); 
       }
	}
	static int [] calculateSpan(int []a) {
		Stack<Integer> s= new Stack<>();
		int span[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			while(!s.isEmpty() && a[s.peek()]<=a[i]) {
				s.pop();
			}
			span[i]=s.isEmpty()?i+1:i-s.peek();
			s.push(i);
		}return span;
	}
}
