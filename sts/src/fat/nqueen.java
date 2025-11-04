package fat;
import java.util.*;
public class nqueen {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		int sol[][]=new int[n][n];
		if(path(n,sol,0)) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(sol[i][j]+" ");
					
				}System.out.println();
			}
		}else System.out.print("No path is available!");
	}

	private static boolean path(int n,int[][] sol,int c) {
		if(c>=n)return true;
		for(int i=0;i<n;i++) {//row we are in;
			if(safe(sol,i,c)) {
				sol[i][c]=1;//if it is safe to place queen then use '1';
				if(path(n,sol,c+1))return true;
				sol[i][c]=0;//if we can't place queen use '0';
			}
		}
		return false;
	}

	private static boolean safe(int[][] sol, int r, int c) {
		for(int i=0;i<c;i++) if(sol[r][i]==1)return false;//row checking;
		for(int i=r,j=c;i>=0&&j>=0;i--,j--) if(sol[i][j]==1)return false;//upper left diagonal
		for(int i=r,j=c;i<sol.length&& j>=0;i++,j--)if(sol[i][j]==1)return false;//lower left diagonal checking
		
		
		return true;
	}
	
}
