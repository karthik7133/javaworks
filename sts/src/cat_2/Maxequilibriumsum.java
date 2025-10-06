package cat_2;
//max equilibrium sum
import java.util.*;
public class Maxequilibriumsum {
	public static void main(String[] args) {
	     Scanner x = new Scanner(System.in);
	     System.out.println("hi");
	     int n=x.nextInt();
	     int a[] = new int[n];
	     
	     for(int i=0;i<n;i++)a[i]=x.nextInt();
	     int psum=a[0];
	     int ssum=a[n-1];
	     int max=0;
	     int i=0;int j=n-1;
	     while(i<=j){
	         if(psum==ssum)max=Math.max(max,ssum);
	         if(psum<ssum){
	             i++;
	             psum+=a[i];}
	         else {j--;
	             ssum+=a[j];}
	     }System.out.println(max);
	 }
}


