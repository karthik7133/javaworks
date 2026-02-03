package cat_1;
import java.util.*;
class Main{
	static Stack<Integer> s = new Stack<>();
	static Stack<Integer> m = new Stack<>();
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n =x.nextInt();
		for(int i=0;i<n;i++) {
			s.push(x.nextInt());
			if(m.isEmpty())m.push(s.peek());
			if(m.peek()>s.peek())m.push(s.peek());
		}
		System.out.println(m.peek());
	}
	static void remove() {
		if(m.peek()==s.peek())m.pop();
		else s.pop();
	}
}