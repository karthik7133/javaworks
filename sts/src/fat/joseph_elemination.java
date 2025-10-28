package fat;
import java.util.*;
public class joseph_elemination {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		int r=x.nextInt();
		System.out.println(jos(n,r));
	}
	static int jos(int n,int r) {
		if(n==1)return 1;
		return(jos(n-1,r)+r-1)%n+1;
	}
}
