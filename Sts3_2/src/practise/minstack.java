package practise;
import java.util.*;
public class minstack {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		Stack<Integer> s=new Stack<>();
		Stack<Integer> m=new Stack<>();
		int n=x.nextInt();
		for(int i=0;i<n;i++) {
			s.push(x.nextInt());
			if(m.isEmpty() || m.peek()>s.peek())m.push(s.peek());
		}
		System.out.println(m.peek());
	}

}
