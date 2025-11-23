package fat;
import java.util.*;
public class Maneuvering {
	public static void main(String[] args) {
		//right or down..
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		int m=x.nextInt();
		System.out.println(paths(m,n));
	}
	static int paths(int m,int n) {
		if(m==1 || n==1)return 1;
		return paths(m-1,n)+paths(m,n-1);
	}
}
