package javapractise;
import java.util.*;
public class Threads{
	public static void main(String[] args) throws Exception {
		Scanner x = new Scanner(System.in);
		System.out.print("Enter the sentence:");
		String k= x.nextLine();
		Runnable a =() ->{
			int a1 =0;
	        for (int i = 0; i < k.length(); i++) {
	            char ch = k.charAt(i);
	            if (String.valueOf(ch).matches("[aeiouAEIOU]")) {
	                a1++;
	            }
	        }System.out.println(a1+"vovels are there");
		};
		Runnable b = () ->{
			String h= "";
			for(int i =0;i<k.length();i++) {
				String ch = k.charAt(i)+"";
				ch =String.valueOf(ch).toUpperCase();
				h+=ch;
			}System.out.println(h);
		};
		Runnable c = () ->{
			int c1=0;
			String n [] =k.split(" ");
			for (int i =0; i<n.length;i++) {
				 if (n[i].substring(0,1).matches("[sS]")){
					 c1++;
				 }
			}System.out.println(c1 +" words starts wither letter s ");
		};
		Runnable d =() ->{
			String n [] = k.split(" ");
			int d2 = 0;
			for(int i =0;i<n.length;i++) {
				String d1 = n[i];
				if(d1.equalsIgnoreCase("india")) {
					d2=1;
				}
			}if (d2==1) {
				System.out.println("yes the word india is found in string");
			}
		};
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(c);
		Thread t4 = new Thread(d);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

