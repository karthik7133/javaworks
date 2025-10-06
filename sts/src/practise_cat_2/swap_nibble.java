package practise_cat_2;
import java.util.*;
public class swap_nibble {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Enter bin Num:");
		int n=x.nextInt();
		System.out.println((n&240)>>4|(n&15)<<4);
	}
}
