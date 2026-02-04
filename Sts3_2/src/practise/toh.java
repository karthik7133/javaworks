package practise;
import java.util.*;
public class toh {
	static Stack<Integer>au=new Stack<>();
	static Stack<Integer>sr=new Stack<>();
	static Stack<Integer>de=new Stack<>();
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		for(int i=n;i>0;i--) {
			sr.push(i);
		}
		char a='A',s='S',d='D';
		if(n%2==0) {
			char t=a;
			a=d;
			d=t;
		}
		int moves=(int) (Math.pow(2, n)-1);
		for(int i=1;i<=moves;i++) {
			if(i%3==0)change(au,de,a,d);
			if(i%3==1)change(sr,de,s,d);
			if(i%3==2)change(sr,au,s,a);
			
		}
		
	}
	static void change(Stack<Integer> s1,Stack<Integer> s2,char a,char b) {
		int v1,v2;
		v1=s1.isEmpty()?Integer.MIN_VALUE:s1.pop();
		v2=s2.isEmpty()?Integer.MIN_VALUE:s2.pop();
		if(v1==Integer.MIN_VALUE) {
			s1.push(v2);
			System.out.println("Move the disc "+v2+" from "+b +" to "+a);
		}
		else if(v2==Integer.MIN_VALUE) {
			s2.push(v1);
			System.out.println("Move the disc "+v1+" from "+a +" to "+b);
		}
		else if(v1<v2) {
			s2.push(v2);
			s2.push(v1);
			System.out.println("Move the disc "+v1+" from "+a +" to "+b);
		}
		else {
			s1.push(v1);
			s1.push(v2);
			System.out.println("Move the disc "+v2+" from "+b +" to "+a);
		}
	}
}
