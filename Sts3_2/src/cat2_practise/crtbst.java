package cat2_practise;
import java.util.*;
public class crtbst {
	static node first,middle,last,prev;
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		String []s=new String[n];
		node r=insert(s);
		bst(r);
	}
	static void bst(node r) {
		first=middle=last=prev=null;
		
		crtbstutil(r);
		if(last==null)swap(first,middle);
		else swap(first,last);
	}
	static void crtbstutil(node r) {
		if(r==null)return;
		crtbstutil(r.left);
		if(prev!=null && prev.data>r.data) {
			if(first!=null) {
				first=prev;
				middle=r;
			}else last=r;
		}prev=r;
		crtbstutil(r.right);
	}
	static void swap(node l,node r) {
		int t=l.data;
		l.data=r.data;
		r.data=t;
		
	}
	
	static node insert(String s[]) {
		int l=s.length;
		if(l==0 ||s[0].equals("null"))return null;
		node r=new node(Integer.parseInt(s[0]));
		Queue<node> q=new LinkedList<>();q.add(r);int i=1;
		while(!q.isEmpty() && i<l) {
			node cur=q.poll();
			if(i<l && !s[i].equals("null")) {
				cur.left=new node(Integer.parseInt(s[i]));
				q.add(cur.left);
			}i++;
			if(i<l && !s[i].equals("null")) {
				cur.right=new node(Integer.parseInt(s[i]));
				q.add(cur.right);
			}i++;
		}return r;
	}
}

