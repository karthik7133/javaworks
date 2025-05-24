import java.util.Scanner;
public class Permutations {
	public static void per(char [] a,int fi) {
		if (fi==a.length-1) {
			System.out.println(a);
			return;
		}for (int j=fi;j<a.length;j++) {
		Permutations.swap(a, fi, j);
		per(a,fi+1);
		Permutations.swap(a,fi,j);}
		
	}
	public static void swap(char a[] ,int fi,int j) {
		char temp=a[j];
		a[j]=a[fi];
		a[fi]=temp;
	}
	public static void main(String[] args) {
		System.out.print("Enter the String :");
		Scanner x = new Scanner(System.in);
		char [] a =x.next().toCharArray();
		Permutations.per(a,0);
		System.out.println(a);
	}
}
