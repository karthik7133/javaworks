package cat_2;
import java.util.*;
public class leaders {
	public static void main(String [] ar){
        //leaders in an array..
		//reverse order o(1);
		//straight order O(n);
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(a[i]>max){
                max=a[i];
                System.out.print(max+" ");
            }
        }
    }
}

