package practise;
import java.util.*;
public class sortwithout {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		int n=x.nextInt();
		for(int i=0;i<n;i++) {
			q.add(x.nextInt());
		}
		cal(q);
		System.out.println(q);
	}
	static void cal(Queue<Integer> q) {
		int n=q.size();
		for(int i=0;i<n;i++) {
			int min=100000,minin=-1;
			for(int j=0;j<n;j++) {
				int t=q.poll();
				if(t<=min && j<n-i) {
					min=t;
					minin=j;
				}q.add(t);
			}
			for(int j=0;j<n;j++) {
				int t=q.poll();
				if(j!=minin)q.add(t);
			}
			q.add(min);
		}
	}
}
