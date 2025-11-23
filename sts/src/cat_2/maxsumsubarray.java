package cat_2;
import java.util.*;
public class maxsumsubarray {
	static Scanner x= new Scanner(System.in);
	public static void main(String[] args) {
	     //no of sub arrays n(n+1)/2;
		//time O(n);space O(1);
		//which makes it difficult is -VE nums and zero included makes it difficult.
		//pref prod==0 or suff==0 we change pref prod =1.
	
	     int n=x.nextInt();
	     int a[]= new int [n];
	     for(int i=0;i<n;i++)a[i]=x.nextInt();
	     int max=Integer.MIN_VALUE;
	     for(int i=0;i<n;i++){
	         int p=1;
	         for(int j=i;j<n;j++){
	             p*=a[j];
	             max=Math.max(p,max);
	         }
	     }System.out.println(max);
	 }
	
	
}
