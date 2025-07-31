package leetcode;

public class permutations {
	public static void main(String[] args) {
		String a="car";
		genpermutations(a.toCharArray(),0);
	}
	private static void genpermutations(char[] charArray, int index) {
		if(index==charArray.length-1) {
			System.out.println(String.valueOf(charArray));
			return;
		}
		for(int i=index;i<charArray.length;i++) {
			swap(charArray,index,i);
			genpermutations(charArray,index+1);
			swap(charArray,index,i);
		}
		
	}
	private static void swap(char[] charArray, int index, int i) {
		char temp=charArray[index];
		charArray[index]=charArray[i];
		charArray[i]=temp;
		
	}
	
}
