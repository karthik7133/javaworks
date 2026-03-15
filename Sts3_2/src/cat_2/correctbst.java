package cat_2;

import java.util.*;

public class correctbst {
	static Node prev,first,last,middle;
	void crtbst(Node root) {
		prev=first=last=middle=null;
		correctbstuitl(root);
		if(last==null) {
			swap(first,middle);
		}else swap(first,last);
	}
	void swap(Node a,Node b) {
		int t=a.data;
		a.data=b.data;
		b.data=t;
	}
	void correctbstuitl(Node root) {
		if(root ==null)return;
		correctbstuitl(root.left);
		if(prev!=null && prev.data>root.data) {
			if(first==null) {
				first=prev;
				middle=root;
			}else last=root;
		}
		prev=root;
		correctbstuitl(root.right);
	}
	void print(Node root) {
		if(root == null)return;
		print(root.left);
		System.out.println(root.data);
		print(root.right);
	}
	 Node insertdata(String [] values) {
		if(values.length==0 || values[0].equals("null"))return null;
		Node root = new Node(Integer.parseInt(values[0]));
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int i=1;
		while(i<values.length && !q.isEmpty()) {
			Node cur=q.poll();
			if(i<values.length && !values[i].equals("null")) {
				cur.left=new Node(Integer.parseInt(values[i]));
				q.add(cur.left);
			}i++;
			if(i<values.length && !values[i].equals("null")) {
				cur.right=new Node(Integer.parseInt(values[i]));
				q.add(cur.right);
			}i++;
		}
		return root;
	}
	
}
class Node{
	Node right,left;
	int data;
	Node(int d){
		data=d;
		left=right=null;
	}
}