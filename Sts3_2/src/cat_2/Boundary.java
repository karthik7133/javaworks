package cat_2;
import java.util.*;
public class Boundary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String[] tree = sc.nextLine().split(" ");

        Node root = insert(tree);

        boundtrav(root);

        sc.close();
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
	static void left(Node n) {
		if(n==null || (n.left==null || n.right==null) )return;
		System.out.println(n.data);
		if(n.left!=null) {
			left(n.left);
		}else left(n.right);
	}
	static void leaves(Node n) {
		if(n==null)return;
		if(n.left==null && n.right==null) {
			System.out.println(n.data);return;
		}
		leaves(n.left);
		leaves(n.right);
	}
	static void right(Node n) {
		if(n==null || (n.left==null && n.right==null))return;
		if(n.left==null) {
			right(n.right);
		}else right(n.left);
		System.out.println(n.data);
	}
	static void boundtrav(Node root) {
		if(root==null)return;
		System.out.println(root.data);
		left(root.left);
		leaves(root);
		right(root.right);
	}
}

