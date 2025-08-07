package leetcode;

public class zero_subarrays {
	public static void main(String[] args) {
		int a[]= {0,0,0,2,0,0};
		int count=0;int sum=0;int prev=0;
		for(int i:a) {
			if(i==0) {
				count++;prev=count;
			}else count=0;
			if (prev>count) {
				sum+=fact(prev);
			}
		}System.out.println(sum);
	}

	private static int fact(int prev) {
		if (prev==1 ||  prev==0)return 1;
		int fact=1;
		for(int i=2;i<=prev;i++) {
			fact*=i;
		}
		return fact;
	}
}
