package shortsem_1;
import java.util.*;
public class bulb {
	public static void main(String []a) {
		Random rand=new Random();
		int num[]=new int[8];
		for(int i=0;i<8;i++) {
			num[i]=rand.nextInt(2);
		}
		System.out.println(Arrays.toString(num));
		
		bulb.bool_to_decimal(num);
	}
	
	public static void bool_to_decimal(int []num){
		byte byt=0;
		for(int j=0;j<num.length;j++) {
			byt=(byte) ((byt<<1)|(num[j]&1));
		}
		 System.out.println((int)byt);
	}
}
