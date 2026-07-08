package fat;
import java.util.*;
public class valiedDistribution {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int k=x.nextInt();
		 int n=x.nextInt();
		 int a[]= new int[n];
		 for(int i=0;i<n;i++) {
			 a[i]=x.nextInt();
		 }
		 if(v(a,k,n))System.out.println("valied distribution");
		 else System.out.print("not valied distribution");
	}

	private static boolean v(int[] a, int k,int n) {
		HashMap<Integer,Integer>m= new HashMap<>();
		for(int i=0;i<n;i++) {
			m.put(a[i],m.getOrDefault(a[i], 0)+1);
		}
		for(Map.Entry<Integer,Integer >e:m.entrySet()) {
			if(e.getValue()>2*k)return false;
		}
		return true;
	}
	
}
