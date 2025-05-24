package dsa;
class Node2{
	int data;
	Node2 left;
	Node2 right;
	Node2(int a){
		data =a ;
		left=right=null;
	}
}
public class treell {
	Node2 root;
	treell(){
		root=null;
	}
	
	Node2 insert(Node2 n,int a) {
		if(n==null) {
			n=new Node2(a);
			return n;
		}
		if(a>n.data) {
			n.right=insert(n.right,a);
		}else if(a<n.data) {
			n.left=insert(n.left,a);
		}
		return n;
	}void insert1(int data){
		insert(root,data);
	}
	void inorder(Node2 n) {
		if(n!=null) {
			inorder(n.left);
			System.out.println(n.data);
			inorder(n.right);
		}
	}
	void postorder(Node2 n) {
		if(n!=null) {
			postorder(n.left);
			postorder(n.right);
			System.out.println(n.data);
		}
	}
	void preorder(Node2 n) {
		if(n!=null) {
			System.out.println(n.data);
			preorder(n.left);
			preorder(n.right);
		}
	}
	public static void main(String[] args) {
        treell tree = new treell();
        tree.root = tree.insert(tree.root, 50);
        tree.insert1(20);
        tree.insert1(30);
        tree.insert1(40);
        tree.insert1(50);
        tree.insert1(60);
        tree.insert1(10);
        System.out.println("In-order traversal:");
        tree.inorder(tree.root);
        System.out.println("\nPre-order traversal:");
        tree.preorder(tree.root);
        System.out.println("\nPost-order traversal:");
        tree.postorder(tree.root);
    }
}

