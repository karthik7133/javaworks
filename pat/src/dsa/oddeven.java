package dsa;

public class oddeven {
	public static void main(String[] args) {
		node head=new node(1);
		int a[]={2,3,4,5};
		insert(a,head);print(head);;print(reverse(head));reorder(head);
	}
	static void insert(int a[],node r) {
		node t=r;
		for(int i:a) {
			node n=new node(i);
			t.next=n;t=t.next;
		}
	}
	static void reorder(node r) {
    // 1. Find middle and split
    node f = r, s = r;
    while (f != null && f.next != null) {
        f = f.next.next;
        s = s.next;
    }
    
    node h1 = r;
    node h2 = reverse(s.next);
    s.next = null; // Important: cap the first half

    // 2. Start the new list with the first data point
    node h3 = new node(h1.d);
    node current = h3;
    h1 = h1.next; // Move h1 because we already used the head data

    // 3. Build the rest
    while (h1 != null || h2 != null) {
        if (h2 != null) {
            current.next = new node(h2.d);
            current = current.next;
            h2 = h2.next;
        }
        if (h1 != null) {
            current.next = new node(h1.d);
            current = current.next;
            h1 = h1.next;
        }
    }
    print(h3);
}
	static node reverse(node r) {
		node prev=null,curr=r;
		while(curr!=null) {
			node t=curr.next;
			curr.next=prev;
			prev=curr;
			curr=t;
		}return prev;
	}
	static void print(node r) {
		node t=r;
		while(t.next!=null) {
			System.out.print(t.d+"->");t=t.next;
		}System.out.println(t.d);
	}
}
class node{
	int d;
	node next;
	node(int dat){
		d=dat;
		next=null;
	}
}
