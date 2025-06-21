package concepts;

import java.util.Arrays;

public class Selection_sort {

	public static void main(String[] args) {
		int a[]= {3,2,4,0,1};
		sort_selection s= new sort_selection();
		s.sort(a);

	}
	

}
class sort_selection{
	public void sort(int a[]) {
		
		for(int j=0;j<a.length;j++) {
			int small=j;
			for(int i=j+1;i<a.length;i++) {
				if(a[small]>a[i]) {
					small=i;
				}
			}if (small != j) {
                a[j] ^= a[small];
                a[small] ^= a[j];
                a[j] ^= a[small];
            }
			
			
		}
		System.out.println(Arrays.toString(a));
	}
}
