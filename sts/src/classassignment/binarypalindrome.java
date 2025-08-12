package classassignment;
import java.util.*;
public class binarypalindrome {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.print("enter any number:");
		int a=x.nextInt();
		String binary=Integer.toBinaryString(a);
		boolean f=true;
		for(int i=0;i<binary.length()/2;i++) {
			if(binary.charAt(i)!=binary.charAt(binary.length()-1-i)) {
				f=false;break;
			}
		}System.out.println(f);
	}
}
