package leetcode;

public class dectobin {
	public static void main(String[] args) {
		int a=101;
		int count=0;int sum=0;
		while(a>0) {
			if(a%10!=0)
			sum+=(a%10)*Math.pow(2, count);count++;
			a/=10;
		}System.out.println(sum);
	}
}
