package dsa;

public class maxwater {
	public static void main(String[] args) {
		System.out.println(maxArea(new int[]{2,3,4,5,6,7}));
	}
	public static int maxArea(int[] height) {
        int l=0,r=height.length-1,c=height.length-1;
        int max=0;
        while(l<r){
            int left=height[l];
            int right=height[r];
            int min=Math.min(left,right);
            if(min*c>max)max=min*c;c--;
            if (min==left)l++;else r--;
        }return max;

    }
}
