package practise;
import java.util.*;
public class strobogramatic {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter the number to check:");
		HashMap<Character ,Character> map=new HashMap<>();
		map.put('0', '0');
		map.put('1', '1');
		map.put('9', '6');
		map.put('6', '9');
		map.put('8', '8');
		String k=x.next();
		for(int i=0;i<k.length()/2;i++) {
			char c=k.charAt(i);char m=k.charAt(k.length()-i-1);
			Character mirror=map.get(c);
			if(mirror==null | mirror!=m) {
				System.out.println("Not stobrogramatic !");return ;
			}
		}System.out.println("Yes it's stobrogramatic!");
	}
}
