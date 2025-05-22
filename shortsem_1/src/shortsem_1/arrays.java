package shortsem_1;


import java.util.*;
public class arrays {
	public static void main(String[] args) {
		int a[]= {1,3,24,2,0,0,24};
		Arrayops c=new Arrayops();
		System.out.println(c.copyofarr(a));
		System.out.println("is available : "+c.searchele(a, 3));
		System.out.println("ele vise repeatations: "+c.freqcnt(c.unqset(a),a));
		System.out.println("Duplicate values are :"+c.duplicate(a));
	}
}
class Arrayops{
	public String copyofarr(int []a) {
		int []b=new int[a.length];
		Arrays.copyOfRange(a, 0, a.length);
		return Arrays.toString(a);
	}
	public boolean searchele(int[] a,int val) {
		boolean flag=false;
		for(int i:a) {
			if(i==val) {
				flag=true;
				break;
			}
		}return flag;
	}
	
	public String freqcnt(Integer [] a,int []a1) {
		int c=0;
		int b[]=new int [a.length];
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a1.length;j++) {
				if(a1[j]==a[i])
					c++;
			}b[i]=c;c=0;
		}return Arrays.toString(b);
	}
	
	public static Integer [] unqset(int[] a) {
		Arrayops A=new Arrayops();
		ArrayList <Integer> list=new ArrayList<>();
		for(int ele:a) {
			if(!A.isinlist(ele,list)) {
				list.add(ele);
			}
		}Integer [] array=list.toArray(new Integer[0]);
		System.out.println(Arrays.toString(array));
		return array;
	}
	public  boolean isinlist(int val,ArrayList<Integer> a) {
		boolean flag=false;
		for(int ele:a) {
			if(ele==val)
				flag=true;
		}return flag;
	}
	
	public String duplicate(int []a) {
		int c=0;
		Arrayops A=new Arrayops();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i:a) {
			for(int j=0;j<a.length;j++) {
				if(a[j]==i)
					c++;
			}
			if(c>=2  & !A.isinlist(i,list))
				list.add(i);c=0;
		}Integer [] ans=list.toArray(new Integer[0]);
		return Arrays.toString(ans);
	}
}
