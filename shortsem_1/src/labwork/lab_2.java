package labwork;
import java.util.*;
public class lab_2 {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.print("Enter the string:");
		String s=x.next();
		System.out.println("Is "+s+" palindrome :"+lab_2.ispalindrome(s));
		System.out.println();
		System.out.println("vowel,consonet,digit,special accordingly are:"+lab_2.charcount(s));
		System.out.println();
		System.out.println("are two strings are equal:"+lab_2.stringcomp("karthik","keerthi"));
		System.out.println();
		lab_2.occrance('k', s);
		System.out.println();
		lab_2.split("karthik is good boy !");
		System.out.println();
		lab_2.startsandends("good is good", "good");
		System.out.println();
		lab_2.shortname("jawahar lal nehru");
		lab_2.password("karthik", "234567");
	}
	public static boolean ispalindrome(String a) {
		String rev="";boolean flag=false;
		for(int i=a.length()-1;i>=0;i--) {
			rev+=a.charAt(i);
		}
		System.out.println("reverse of string "+a+" is: "+rev);
		if(rev.equals(a))
			flag=true;
		return flag;
	}
	public static String charcount(String a) {
		a=a.toLowerCase();
		char []vow= {'a','e','e','i','o','u'};
		char temp;
		int vowcount=0;
		int conc_count=0;
		int digitcount=0;
		int specialchar=0;
		for (int j = 0; j < a.length(); j++) {
	           temp = a.charAt(j);
	           if (Character.isLetter(temp)) {
	               boolean isVowel = false;
	               for (char v : vow) {
	                   if (temp == v) {
	                       isVowel = true;
	                       break;
	                   }
	                }
	                if (isVowel) {
	                    vowcount++;
	                } else {
	                    conc_count++;
	                }
	            } else if (Character.isDigit(temp)) {
	                digitcount++;
	            } else {
	                specialchar++;
	            }
	        }int arr[]= {vowcount,conc_count,digitcount,specialchar};
		return Arrays.toString(arr);
	}
	public static boolean stringcomp(String a,String b) {
		boolean flag=false;
		if(a.equalsIgnoreCase(b))
			flag=true;
		return flag;
	}
	public static void occrance(char c,String a) {
		System.out.println("first occrance:"+a.indexOf(c));
		System.out.println("first occrance:"+a.lastIndexOf(c));
		
	}
	
	public static void split(String c) {
		String [] words=c.split(" ");
		for(String word:words)
			System.out.println(word);
	}
	public static void startsandends(String c,String word) {
		if(c.startsWith(word) & c.endsWith(word))
			System.out.println("Yes its starts and ends with same word");
	}
	public static void shortname(String c) {
		String []d=c.split(" ");
		String shortname="";
		shortname+=d[0].charAt(0);
		shortname+=d[1].charAt(0);
		shortname+=d[2];
		System.out.println("Short name is:"+shortname);
				
	}
	public static void password(String name,String reg) {
		String pass=name.substring(0,4);
		int c=0;
		for(int i=reg.length()-1;i>=0;i--) {
			c++;
			if(c<3) {
				pass+=reg.charAt(i);
			}
			
			
		}
		System.out.println("password is:"+pass);
		
	}
	
}
