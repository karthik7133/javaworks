package Tree;

public class inplementing {
	Node root;
	class Node {
		Node left;
		Node right;
		int data;
		Node (int a){
			this.data=a;
		}
	}
	void creation() {
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		Node five=new Node(5);
		Node six=new Node(6);
		root=first;
		root.left=second;
		root.right=third;
		second.left=fourth;
		third.left=five;
		third.right=six;
	}
	void preorder(Node r) {
		if(r==null) {
			return;
		}
		System.out.print(r.data +" ");
		preorder(r.left);
		preorder(r.right);
	}
	void inorder(Node r) {
		if(r==null) {
			return;
		}
		inorder(r.left);
		System.out.print(r.data +" ");
		inorder(r.right);
	}
	void postorder(Node r) {
		if(r==null) {
			return;
		}
		postorder(r.left);
		postorder(r.right);
		System.out.print(r.data+" ");
	}
	public static void main(String[] args) {
		inplementing k= new inplementing();
		k.creation();
		System.out.println("\nthis is preorder!");
		k.preorder(k.root);
		System.out.println("\nthis is inorder!");
		k.inorder(k.root);
		System.out.println("\nthis is postorder!");
		k.postorder(k.root);
	}
}

