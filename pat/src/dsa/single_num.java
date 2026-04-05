package dsa;
import java.util.*;
public class single_num {
	public static void main(String[] args) {
		int n[]= {1,1,4,4,5,6,5,};
		System.out.println(singleNumber(n));
		
	}
	public static int singleNumber(int[] nums) {
        if(nums.length==1)return nums[0];
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i+=2){
            if(nums[i-1]!=nums[i])return nums[i-1];
        }
        if(nums.length%2!=0)return nums[nums.length-1];
        else return 0;

    }
}
