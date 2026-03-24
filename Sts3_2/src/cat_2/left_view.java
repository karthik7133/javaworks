package cat_2;
import java.util.*;
public class left_view {
	static int maxlevel=0;static int max1level=0;
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		String s[] = new String[n];
		for(int i=0;i<n;i++)s[i]=x.next();
		Node r=insert(s);
        leftview(r, 1);
        rightview(r,1);
	}
	static Node insert(String [] values) {
		if(values.length==0 || values[0].equals("null"))return null;
		Node root =new Node(Integer.parseInt(values[0]));
		Queue<Node>q = new LinkedList<>();
		q.add(root);int i=1;
		while(!q.isEmpty() && i<values.length) {
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
	static void leftview(Node root,int l) {
		if(root==null)return;
		if(l>maxlevel) {
			System.out.println(root.data+" ");
			maxlevel=l;
		}
		leftview(root.left,l+1);
		leftview(root.right,l+1);
	}
	
	static void rightview(Node root ,int l) {
		if(root==null)return;
		if(l>max1level) {
			System.out.println(root.data+" ");
			max1level=l;
		}
		rightview(root.right,l+1);
		rightview(root.left,l+1);
	}
}
