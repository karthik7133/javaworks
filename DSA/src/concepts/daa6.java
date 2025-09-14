package concepts;
import java.util.*;
public class daa6 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n= x.nextInt();
		int []keys= new int[n];
		int [] freq = new int[n];
		int []q = new int [n+1];
		for(int i=0;i<n;i++)keys[i]= x.nextInt();
		for(int i=0;i<n;i++)freq[i]= x.nextInt();
		for(int i=0;i<=n;i++)q[i]=x.nextInt();
		int [] [] cost= new int[n+1][n+1];
		int [] [] weight= new int[n+1][n+1];
		for(int i=0;i<=n;i++) {
			cost[i][i]=q[i];
			weight[i][i]=q[i];
		}
		for(int l=1;l<=n;l++) {
			for(int i=0;i<=n-l;i++) {
				int j=l+i;
				weight[i][j]=weight[i][j-1]+freq[j-1]+q[j];
				cost[i][j]=Integer.MAX_VALUE;
				for(int r=i+1;r<j;r++) {
					int c=cost[i][r-1]+cost[r][j-1]+weight[i][j];
					cost[i][j]=Math.max(c, cost[i][j]);
				}
			}
		}
		for(int i=0;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.println(cost[i][j]);
				if(j<n)System.out.println(" ");
			}System.out.println();
		}
	}
}
