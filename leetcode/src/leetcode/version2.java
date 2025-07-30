package leetcode;

import java.util.Arrays;

public class version2 {
	public static void main(String[] args) {
		System.out.println(version("1.4.00005","1.4.5.000"));
	}
	public static int version(String a,String b) {
		String a1[]=a.split("\\.");
		String a2[]=b.split("\\.");
		int v1=0,v2=0;
		int minversion=(a.length()<b.length())?a.length():b.length();
		if(a.equals(b)) return 0;
		v1=valgen(a1,v1,minversion);v2=valgen(a2,v2,minversion);
		if(v1==v2)return 0;
		else return (v1>v2)?1:-1;
		
	}
	public static int valgen(String [] a1,int v1,int minversion) {
		System.out.println(Arrays.toString(a1));
		int count=0;
		for(int i=0;i<a1.length;i++) {
			v1+=Integer.valueOf(a1[i])*(int)(Math.pow(10, count));
			count++;
		}
		return v1;
	}
}
