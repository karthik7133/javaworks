package fat;
import java.util.*;
public class Maneuvering {
	public static void main(String[] args) {
		//right or down..
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		int m=x.nextInt();
		int mat[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0) {
					mat[i][j]=1;
				}
			}
		}
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				value(mat,i,j);
			}
		}
		System.out.println(mat[m][n]);
		//System.out.println(paths(m,n));
				
	}
	static void value(int mat[][],int r,int c) {
		mat[r][c]=mat[r-1][c]+mat[r][c-1];
	}
	
//	static int paths(int m,int n) {
//		if(m==1 || n==1)return 1;
//		return paths(m-1,n)+paths(m,n-1);
//	}
}
