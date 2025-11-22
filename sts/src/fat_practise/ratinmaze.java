package fat_practise;
import java.util.*;
public class ratinmaze {
	static int mat[][];static int res[][];
	static int r,c,n,m;
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		n=x.nextInt();m=x.nextInt();
		mat=new int[n][m];
		res=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j]=x.nextInt();
			}
		}
		if(rat(0,0,res)) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					System.out.print(res[i][j]+" ");
				}System.out.println();
			}
		}else System.out.println("no path available");
	}
	static boolean rat(int r, int c, int[][] res) {
		if (r == n - 1 && c == m - 1 && mat[r][c] == 1) {
            res[r][c] = 1;
            return true;
        }
		if(r>=0 && c>=0 && r<n && c<m && mat[r][c]==1 && res[r][c]==0) {
			res[r][c]=1;
			if(rat(r+1,c,res))return true;
			if(rat(r,c+1,res))return true;
			res[r][c]=0;
		}
		return false;
	}
}
