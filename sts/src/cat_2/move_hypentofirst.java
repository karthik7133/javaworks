package cat_2;
import java.util.*;
public class move_hypentofirst {
	public static void main(String[] args) {
//		Scanner x = new Scanner(System.in);
//		char c[]=x.nextLine().toCharArray();
//		String a="";
//		for(char ch:c) {
//			if(ch=='-') {
//				a="-"+a;
//			}else a+=ch;
//		}System.out.println(a);
		mover("123kartihk@#$".toCharArray());
	}
	public static void mover(char [] a) {
		String s="";
		for(char c:a) {
			if(Character.isAlphabetic(c) || Character.isDigit(c)) {
				s+=c;
			}else s=c+s;
		}System.out.println(s);
	}
}
