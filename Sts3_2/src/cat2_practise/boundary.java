package cat2_practise;
import java.util.*;
public class boundary {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		String [] s = new String[n];
		for(int i=0;i<n;i++) {
			s[i]=x.next();
		}
		node r=insert(s);
		trav(r);
		//print(r);
	}
	static void print(node r) {
		if(r==null)return;
		print(r.left);
		System.out.print(r.data+" ");
		print(r.right);
	}
	static void trav(node r) {
		if(r==null)return;
		System.out.println(r.data);
		left(r.left);
		leaves(r);
		right(r.right);
	}
	static void left(node r) {
		if(r==null ||(r.right==null && r.left==null))return;
		System.out.println(r.data);
		if(r.left!=null)
		left(r.left);
		else left(r.right);
	}
	static void right(node r) {
		if(r==null ||(r.left==null && r.right==null))return;
		if(r.right!=null)right(r.right);
		else right( r.left);
		System.out.println(r.data);
	}
	static void leaves(node r) {
		if(r==null)return;
		if(r.left==null && r.right==null)System.out.println(r.data);
		leaves(r.left);
		leaves(r.right);
	}
	
	
	
	static node insert(String s[]) {
		int l=s.length;
		if(l==0 || s[0].equals("null"))return null;
		node r=new node(Integer.parseInt(s[0]));
		Queue<node> q = new LinkedList<>();int i=1;
		q.add(r);
		while(i<l && !q.isEmpty()) {
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
class node{
	node left,right;
	int data;
	node(int d){
		data=d;
	}
}
