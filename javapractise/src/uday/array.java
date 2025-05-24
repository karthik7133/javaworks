package uday;

public class array {
    public static void main(String[] args) {
        btree b=new btree();
        b.insert(5);
        b.insert(6);
        b.insert(7);
        b.insert(19);
        b.insert(4);
        b.insert(32);
        b.insert(54);
        b.inorder(b.root);
    }
}
class btree{
	Node root;
	btree(){
		root=null;
	}
	public void insert(int data) {
		root=insertrec(root,data);
	}
	public Node insertrec(Node root,int data) {
		if(root==null)
			root =new Node(data);
		else if(data>root.data) {
			root.right=insertrec(root.right,data);
		}
		else {
			root.left=insertrec(root.left,data);
		}return root;
	}
	public void inorde() {
		inorder(root);
	}
	public void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.println(root.data+" ");
			inorder(root.right);
		}
	}
}
class Node {
    int data;
    Node right,left;

    public Node(int data) {
        this.data = data;
        this.right=this.left = null;
    }
}
