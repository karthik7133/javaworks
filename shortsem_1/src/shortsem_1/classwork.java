package shortsem_1;
import java.util.*;
public class classwork {
	static Scanner x=new Scanner(System.in);
	public static void main(String[] args) {
		int arr1[][]=new int[3][3];
		int arr2[][]=new int[3][3];
		classwork.insert(arr1);
		classwork.insert(arr2);
		
		int arr3[][]=new int[3][3];
		classwork.adder(arr1, arr2, arr3);
		classwork.printer(arr3);
	}
	public static  void insert(int a[][]) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("enter the element at index arr "+(i+1)+" row "+(j+1) +" column:");
				a[i][j]=x.nextInt();
			}
		}
	}public static void adder(int a[][],int b[][],int c[][]) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
	}public static void printer(int a[][]) {
		
			System.out.println(Arrays.deepToString(a));
		
	}
}
