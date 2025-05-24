package mounika;
import java.util.Scanner;
public class Testing{
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Enter length of array (which satisfies max eqil sum) :");
		int g = x.nextInt();
		int [] a = new int[g];
		for (int i =0 ;i<g;i++) {
			System.out.print("Enter the "+(i+1)+" element of array :");
			a[i]=x.nextInt();
		}
		int l = a.length;
		int o=0;int b=0;
		for(int i=0;i<l;i++) {
			for(int j=0;j<i;j++) {
				o+=a[j];
			}
			for (int j=i+1;j<l;j++) {
				b+=a[j];
			}
			if (o==b) {
				System.out.println( "ur num is"+a[i]);
				break;
			}o=0;b=0;
		}
	}
}
