package classassignment;

public class shortsum {
	public static void main(String[] args) {
		int[] a= {12,-14,23,32,50};
		int target=5;
		int min=Integer.MAX_VALUE;
		int f=-1;
		for(int i:a) {
			int or=i;
			int dsum=0;
			int temp_i = Math.abs(i);
			while(temp_i>0) {
				dsum+=temp_i%10;
				temp_i/=10;
			}
			if(dsum==target) {

				if(min>or)
				min=or;
				f=min;
			}
			
		}System.out.println(f);
	}
}
