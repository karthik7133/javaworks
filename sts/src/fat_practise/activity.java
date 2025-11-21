package fat_practise;
import java.util.*;
public class activity {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		int s[]=new int[n];
		int e[]= new int[n];
		for(int i=0;i<n;i++) {
			s[i]=x.nextInt();
		}
		for(int i=0;i<n;i++)e[i]=x.nextInt();
		int last=e[0];
		System.out.println(0 + " ");
		for(int i=1;i<n;i++) {
			if(s[i]<last) {
				System.out.println(i+" ");
				last=e[i];
			}
		}
	}
}
