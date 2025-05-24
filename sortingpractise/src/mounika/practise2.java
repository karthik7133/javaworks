package mounika;
import java.util.*;
public class practise2 {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the bin number:");
		int y=x.nextInt();
		int temp=y;
		int j=0;
		int sum=0;
		while(temp!=0) {
			int d=temp%10;
			if(d==1) {
				sum+=Math. pow(2,j);
			}
			j++;temp/=10;
		}System.out.println(sum);
	}
}