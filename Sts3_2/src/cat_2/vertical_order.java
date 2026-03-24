package cat_2;
import java.util.*;
public class vertical_order {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		String s[] = new String[n];
		insert(s);
	}
	static void vot(Node r) {
		if(r==null)return;
		TreeMap<Integer,List<Integer>>map=new TreeMap<>();
		Queue<pair> q = new LinkedList<>();
		q.add(new pair(r,0));
		while(!q.isEmpty()) {
			pair p=q.poll();
			Node n=p.node;
			int hd=p.hd;
			map.putIfAbsent(hd, new ArrayList<>());
			map.get(hd).add(n.data);
			
			if(n.left!=null) {
				q.add(new pair(n.left,hd-1));
			}
			if(n.right!=null)q.add(new pair(n.right,hd+1));
		}
		
	}
	static Node insert(String s[]) {
		int l=s.length;
		if(l==0 || !s[0].equals("null"))return null;
		Node r=new Node(Integer.parseInt(s[0]));
		Queue<Node>q = new LinkedList<>();
		q.add(r);
		int i=0;
		while(i<l && !q.isEmpty()) {
			Node cur=q.poll();
			if(i<l && !s[i].equals("null")) {
				cur.left=new Node(Integer.parseInt(s[i]));
				q.add(cur.left);
			}i++;
			if(i<l && !s[i].equals("null")) {
				cur.right=new Node(Integer.parseInt(s[i]));
				q.add(cur.right);
			}i++;
		}return r;
	}
}
class pair{
	Node node;
	int hd;
	pair(Node n,int hd){
		this.hd=hd;
		node=n;
	}
}
