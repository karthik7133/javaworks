package leetcode;

import java.util.Arrays;

public class version {
	public static void main(String[] args) {
		System.out.println(escape("1.01","1.001" ));
		
		
	}
	public static int escape(String a,String b){
		int count=0;
		String []a1=a.split("\\.");
		String []a2=b.split("\\.");
		System.out.println(Arrays.toString(a2));
		System.out.println(Integer.valueOf(a1[1])==Integer.valueOf(a2[1]));
		int len=Math.min(a1.length, a2.length);
		int len1=Math.max(a.length(), b.length());
		String d=(a.length()>b.length()?a:b).substring(len+1,len1);
		int version=(a1.length>a2.length)?1:-1;
		
			for(int i=0;i<len;i++) {
				if(Integer.valueOf(a1[i])>Integer.valueOf(a2[i])) {
					return 1;
				}else if(Integer.valueOf(a1[i])<Integer.valueOf(a2[i])) {
					return -1;
				}else{
					count++;
				}
			}if(count==(a.length()<b.length()?a.length():b.length())) {
				if(a1.length==a2.length) {
					return 0;
				}
				else if(d.matches(".*[1-9].*")) {
					System.out.println("hi");
					return version;
				}else{
                    return 0;
                }
				
            }return 0;
	}
}
