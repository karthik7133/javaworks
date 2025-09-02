package cat_2;
import java.util.*;
public class swap_nibble {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=x.nextInt();
		System.out.println((n&240)>>4|(n&15)<<4);
		System.out.println((n&0xf0)>>4|(n&0x0f)<<4);
		System.out.println((n%16)*16+n/16);
		
	}
}
