package fat_practise;
import java.util.*;
public class maneuvering {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		int n=x.nextInt();
		int m=x.nextInt();
		System.out.println(path(m,n));
	}
	static int path(int n,int m){
		if(n==1 || m==1)return 1;
		return (path(m-1,n)+path(m,n-1));
	}
}
