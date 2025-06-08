package labwork;
import java.util.*;
public class stringops {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.print("Enter the phno:");
//		String phno=x.next();
		//stringops.hidelast4(phno);
		//stringops.hidemiddle("chkarthik853@gmail.com");
		stringops.replace("karthik");
		
	}
	public static void hidelast4(String a) {
		System.out.println(a.substring(0,a.length()-4)+"****");
	}
	public static void hidemiddle(String a) {
		String a1[]=a.split("@");
		int len=a1[0].length();
		String b=a1[0]+"@*****"+a.substring(len+6,a.length());
		System.out.println(b);
	}
	public static void replace(String a) {
		String b="";
		int len=a.length()-2;
		b+=a.charAt(0)+"*".repeat(len+1)+a.charAt(a.length()-1);
		System.out.println(b);
		
	}
}
