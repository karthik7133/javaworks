package cat_2;
import java.util.*;
public class majority {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++){
		   a[i]=x.nextInt();
		}
		//boyer moore voting
		//space: O(1);
		//time: O(n);
		//strictly greater than n/2;
		int count=0;int p=0;
		for(int i=1;i<n;i++){
			   int c=a[i];
			   if(count==0){
			       p=a[i-1];count++;
			   }
			   else if(p==c)count++;
			   else count--;
			}

		int count2=0;
		for(int i=0;i<n;i++){
		   if(a[i]==p)count2++;
		}
		if(count2>n/2)System.out.println(p);
		else System.out.print("No majority element");
		}
		
}
