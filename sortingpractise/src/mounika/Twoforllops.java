package mounika;
import java.util.Scanner;
public class Twoforllops{
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print(" Please enter any even number :");
		int r = x.nextInt();int c=r+1;
		int k =(r/2)+1;int i;int j;
		for (int h=0;h<2;h++) {
			for (int d=0;d<2;d++) {
			System.out.println("column :"+d);
			System.out.println("row:"+h);
				for (i=0;i<=r;i++) {
					for(j=0;j<=r+2;j++) {
						if (r%2!=0) {break;
						}else if(i<r/2+1) {
							if (j<=k+i & j>=k-i) {
								System.out.print("* ");	
							}else {System.out.print("  ");}
						}else {if(j<=k+(r-i) & j>=k-(r-i)){
							System.out.print("* ");
						}else {System.out.print("  ");}}
					}System.out.println();
				}
				}
			}
		}
}

	




	



