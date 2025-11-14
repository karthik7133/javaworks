package cat_2;
//multiplication of 2 lage nums.
//t.c =O(n^1.585),s.c
//karastuba in code questions
//what is data type of inputs we will take => long.
//approach => divide and conquer
import java.util.Scanner;

public class karastuba {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.print("Enter the two numbers:");
		System.out.printf("Product of two nums is:%d",k(x.nextLong(),x.nextLong()));
	}
	public static long k(long a1,long b1) {
		if (a1 < 10 || b1 < 10) {
            return a1 * b1;
        }
		
		int len=Math.max(String.valueOf(a1).length(), String.valueOf(b1).length());
		if (len % 2 != 0) {
            len++;
        }
		
		int l1=len/2;
		long a=(a1/(long)Math.pow(10, l1));
		long b=(a1%(long)Math.pow(10, l1));
		long c=(b1/(long)Math.pow(10, l1));
		long d=(b1%(long)Math.pow(10, l1));
		long s1=k(a,c);
		long s2=k(b,d);
		long s3=k(a+b,c+d)-s1-s2;
		long s4=(long) (s1*Math.pow(10, 2*l1)+s3*Math.pow(10, l1)+s2);
		return s4;
		
	}
}
