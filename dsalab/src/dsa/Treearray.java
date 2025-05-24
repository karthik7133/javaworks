package dsa;

import java.util.Arrays;

public class Treearray {
	int tree[];
	int size;
	Treearray(int capacity){
		tree = new int[capacity];
		size=0;
	}
	public static void main(String[] args) {
		Treearray v= new Treearray(10);
		v.insert(5);
		v.insert(10);
		v.insert(23);
		v.display();
	}
	void insert(int a) {
		if(size==tree.length) {
			System.out.println("Tree is full");
		}else {
			tree[size]=a;
			size++;
		}
	}
	void display() {
			System.out.println(Arrays.toString(tree));
	}
	void leftchild(int i) {
		int index=2*i+1;
		if(index<size) {
			System.out.println(tree[index]);
		}else {
			System.out.println("No child exist");
		}
	}
	void rightchild(int i) {
		int index=2*i+2;
		if(index<size) {
			System.out.println(tree[index]);
		}else {
			System.out.println("No child exist");
		}
	}
}

