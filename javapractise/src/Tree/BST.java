package Tree;
class Node{
	int data;
	Node right,left;
	Node(int data) {
		this.data=data;
		left=right=null;
	}
}
public class BST {
	static Node root;
	BST(){
		root=null;
	}
	Node insert(Node n,int a) {
		if(n==null) {
			n =new Node(a);
			return n;
		}if(a>n.data) {
			n.right=insert(n.right,a);
		}else if(a<n.data) n.left=insert(n.left,a);
		return n;
	}
	void insert1(int data) {
		insert(root,data);
	}
	void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data+" ");
		inorder(root.right);
	}
	public static void main(String[] args) {
		BST b=new BST();
		root = b.insert(root, 59);
		b.insert1(40);
		b.insert1(30);
		b.insert1(45);
		b.insert1(24);
		b.insert1(33);
		b.insert1(48);
		b.inorder(root);
	}
}
