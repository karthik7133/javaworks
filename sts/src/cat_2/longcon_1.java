package cat_2;
import java.util.*;
public class longcon_1 {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the Binary String:");
		//sliding window approach
		//time complexity O(n);n->binary string length
		String k=x.nextLine();
		int count=0,max=0,p=0;
		for(int i=0;i<k.length();i++) {
			if(k.charAt(i)=='1')count++;
			else {
				max=Math.max(max, count+p+1);
				p=count;
				count=0;
			}
		}max=Math.max(max, count+p+1);
		System.out.println(max);
	}
}
