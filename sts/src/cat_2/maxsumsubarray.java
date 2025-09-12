package cat_2;
import java.util.*;
public class maxsumsubarray {
	static Scanner x= new Scanner(System.in);
	public static void main(String[] args) {
	     
	     int n=x.nextInt();
	     int a[]= new int [n];
	     for(int i=0;i<n;i++)a[i]=x.nextInt();
	     int max=Integer.MIN_VALUE;
	     for(int i=0;i<n;i++){
	         int p=1;
	         for(int j=i;j<n;j++){
	             p=p*a[j];
	             max=Math.max(p,max);
	         }
	     }System.out.println(max);
	 }
	//bruteforce..
	public void bruteforce() {
		 int n=x.nextInt();
	        int a[]= new int [n];
	        for(int i=0;i<n;i++)a[i]=x.nextInt();
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i<n;i++){
	            int p=1;
	            for(int j=i;j<n;j++){
	                p=p*a[j];
	                max=Math.max(p,max);
	            }
	        }System.out.println(max);
	}
}
