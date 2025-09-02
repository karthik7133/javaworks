package cat_2;
import java.util.*;
public class hour_glass {
	public static void main(String[] args) {
		//(r-2)*(c-2);
		Scanner x=new Scanner(System.in);
		int r=x.nextInt();
		int c=x.nextInt();
		int t=(r-2)*(c-2);
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++ ) {
			for(int j=0;j<c;j++) {
				a[i][j]=x.nextInt();
			}
		}
		int max=0;
		for(int i=0;i<r-2;i++) {
			for(int j=0;j<c-2;j++) {
				int sum=0;
				sum=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
				max=Math.max(sum, max);
	
			}
		}System.out.println(max);
	}
}
