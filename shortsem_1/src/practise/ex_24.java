package practise;

import java.util.*;

public class ex_24 {
	static Scanner x=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter how many elements to be stored:");
		int n=x.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=x.nextInt();
		}
		List<Integer> a=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				if(arr[i]>arr[i+1])a.add(i);
			}else if(i==arr.length-1) {
				if(arr[i]>arr[i-1])a.add(i);;
			}else {
				if(arr[i]>arr[i+1] & arr[i]>arr[i-1])a.add(i);
			}
		}
		System.out.println(Arrays.toString(a.toArray()));
	}
}
